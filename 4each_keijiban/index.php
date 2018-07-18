<!DOCTYPE html>
<html lang="ja">
    
    <head>
        <meta charset="UTF-8">
        <title>4eachblog 掲示板</title>
        <link rel="stylesheet" type="text/css" href="style.css">
    </head>
    <body>
        
        <?php
        mb_internal_encoding("utf8");
        $pdo = new PDO("mysql:dbname=lesson04;host=localhost;","root","mysql");
        $stmt = $pdo->query("select * from 4each_keijiban");
        ?>
        
    <div class="logo">
           <img src="4eachblog_logo.jpg">
        </div>
        <header>
            <ul>
                <li>トップ</li>
                <li>プロフィール</li>
                <li>4eachについて</li>
                <li>登録フォーム</li>
                <li>問い合わせ</li>
                <li>その他</li>
            </ul>
        </header>
        <main>
            <div class="main-container">
                <div class="left">
                    <h1>プログラミングに役立つ掲示板</h1>
                    
        <!--登録フォーム-->
        <div class="nyuuryoku">
            <form method="post" action="insert.php">
                <div class="textnyu">入力フォーム</div>
        <!--データベースへ-->
                <label>ハンドルネーム</label>
                <br>
                <input type="text" size="35" name="handlename">
            
            <div>
                <label><br>タイトル</label>
                <br>
                <input type="text" size="35" name="title">
            </div>
            
            <div>
                <label><br>コメント</label>
                <br>
                <textarea cols="60" rows="7" name="comments"></textarea>
            </div>
            <div>
                <input type="submit" value="送信する">
            </div>
            </form>
        </div>
                    <!--ここから結果表示欄1-->
                    <?php
                    while ($row = $stmt->fetch()){
                        echo "<div class='kekka1'>";
                        echo "<h3>".$row['title']."</h3>";
                        echo "<div class='contents'>";
                        echo $row['comments'];
                        echo "<div class='handlename'>posted by ".$row['handlename']."</div>";
                        echo "</div>";
                        echo "</div>";
                    }
                    ?>
                    
                    <!--ここから結果表示欄2-->
                    <?php
                    while ($row = $stmt->fetch()){
                        echo "<div class='kekka2'>";
                        echo "<h3>".$row['title']."</h3>";
                        echo "<div class='contents'>";
                        echo $row['comments'];
                        echo "<div class='handlename'>posted by ".$row['handlename']."</div>";
                        echo "</div>";
                        echo "</div>";
                    }
                    ?>
                                        
                    </div>
                    <div class="right">
                        <h3>人気の記事</h3>
                        <ul>
                            <li>PHPのオススメ本</li>
                            <li>PHP　MyAdminの使い方</li>
                            <li>今話題のエディタ Top5</li>
                            <li>HTMLの基礎</li>
                        </ul>
                        <br>
                        <h3>オススメリンク</h3>
                        <ul>
                            <li>インターノウス株式会社</li>
                            <li>XAMPPのダウンロード</li>
                            <li>Eclipseのダウンロード</li>
                            <li>Bracketsのダウンロード</li>
                        </ul>
                        <br>
                        <h3>カテゴリ</h3>
                        <ul>
                            <li>HTML</li>
                            <li>PHP<li>
                            <li>MySQL</li>
                            <li>javaScript</li>
                        </ul>
                        
                    </div>
                </div>
        </main>
        <footer>
            copyright (c) internous | 4each blog is the one which provides A to Z about programming.
        </footer>
        
    
        
        
    </body>
</html>