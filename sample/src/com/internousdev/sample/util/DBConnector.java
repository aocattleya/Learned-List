package com.internousdev.sample.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnector {

	private static final String driverName = "com.mysql.jdbc.Driver";
	private static final String url = "jdbc:mysql://localhost/sample_database";	// sample_databaseは使用するデータベースの名前
	private static final String user = "root";
	private static final String password = "mysql";

	// データベースとの接続を取得
	public Connection getConnection(){

		Connection connection = null;

		try{
			Class.forName(driverName);		// ドライバークラスをロードしてイニシャライザを実行させる(DriverManagerを使用するためのおまじない)
			connection = DriverManager.getConnection(url, user, password);		// データベースとの接続を取得

		}catch (ClassNotFoundException e){	// driverNameが見つからなかったときの例外
			e.printStackTrace();

		}catch (SQLException e){	// SQL関係の例外
			e.printStackTrace();
		}

		return connection;
	}
}
