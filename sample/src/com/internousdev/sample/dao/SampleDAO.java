package com.internousdev.sample.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.internousdev.sample.dto.SampleDTO;
import com.internousdev.sample.util.DBConnector;

public class SampleDAO {

	// idが一致しているレコードを取得
	public SampleDTO selectById(int id){

		// データベースとの接続を取得
		DBConnector dbConnector = new DBConnector();
		Connection connection = dbConnector.getConnection();

		// SQL文作成
		String sql = "SELECT * FROM sample_table WHERE id=?";		// idが一致しているレコードを取得

		// 取得したデータを入れる変数を作成
		SampleDTO dto = new SampleDTO();

		try{
			// SQL文を編集、実行できる状態へ変換
			PreparedStatement preparedStatement = connection.prepareStatement(sql);

			// SQL文を編集、一つ目の?にidの値を設定
			preparedStatement.setInt(1, id);

			// SQL文を実行、実行結果がresultSetに入る
			ResultSet resultSet = preparedStatement.executeQuery();

			// 取得するデータが1個のみの場合はifで判定する (idはprimary keyで作成されているため値が重複することはない)
			if (resultSet.next()){	// next: 次のレコードを参照、戻り値はレコードが存在するか true:false

				// resultSetからデータを取得してdtoに値を設定	getInt,getStringの引数はテーブルのカラム名を指定
				dto.setId(resultSet.getInt("id"));
				dto.setName(resultSet.getString("name"));

				/*
				 * dto.setId(resultSet.getInt("id"));
				 * dto.setName(resultSet.getString("name"));
				 * 上記を2行に分けて書く方法

				int i = resultSet.getInt("id");		// resultSetからidカラムの値を取得
				dto.setId(i);						// 取得した値をdtoに設定

				String s = resultSet.getString("name");		// resultSetからnameカラムの値を取得
				dto.setName(s);								// 取得した値をdtoに設定

				 */
			}
		}catch (SQLException e){	// 例外発生
			e.printStackTrace();	// 処理の流れをコンソールに表示
		}

		try{
			connection.close();		// データベースとの接続を閉じる

		}catch (SQLException e){	// 例外発生
			e.printStackTrace();	// 処理の流れをコンソールに表示
		}

		return dto;		// 取得してきたデータが入った変数を返す
	}

	// 全てのレコードを取得
	public List<SampleDTO> selectAll(){

		// データベースとの接続を取得
		DBConnector dbConnector = new DBConnector();
		Connection connection = dbConnector.getConnection();

		// SQL文作成
		String sql = "SELECT * FROM sample_table WHERE";		// 全てのレコードを取得

		// 取得したデータを入れる変数を作成(リスト)
		List<SampleDTO> list = new ArrayList<SampleDTO>();

		try{
			// SQL文を編集、実行できる状態へ変換
			PreparedStatement preparedStatement = connection.prepareStatement(sql);

			// SQL文に?がないのでsetInt,setString等はしない


			// SQL文を実行、実行結果がresultSetに入る
			ResultSet resultSet = preparedStatement.executeQuery();

			// 取得するデータが複数ある場合はwhileで判定する
			while (resultSet.next()){	// next: 次のレコードを参照、戻り値はレコードが存在するか true:false

				// リストに追加するデータを作成
				SampleDTO dto = new SampleDTO();

				// resultSetからデータを取得してdtoに値を設定	getInt,getStringの引数はテーブルのカラム名を指定
				dto.setId(resultSet.getInt("id"));
				dto.setName(resultSet.getString("name"));

				// リストに追加
				list.add(dto);
			}
		}catch (SQLException e){	// 例外発生
			e.printStackTrace();	// 処理の流れをコンソールに表示
		}

		try{
			connection.close();		// データベースとの接続を閉じる

		}catch (SQLException e){	// 例外発生
			e.printStackTrace();	// 処理の流れをコンソールに表示
		}

		return list;		// 取得してきたデータが入った変数を返す
	}
}
