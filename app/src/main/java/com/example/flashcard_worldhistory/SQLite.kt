package com.example.flashcard_worldhistory

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

class SQLite(context: Context) : SQLiteOpenHelper(context, "SQLite.db", null, 1) {

    override fun onCreate(db: SQLiteDatabase) {

        db.execSQL(
            "CREATE TABLE MyTable1" +
                    "(" +
                    "Word TEXT" +
                    ", Mean TEXT" +
                    ")"
        )

        db.execSQL(
            "CREATE TABLE MyTable2" +
                    "(" +
                    "Word TEXT" +
                    ", Mean TEXT" +
                    ")"
        )

        db.execSQL(
            "CREATE TABLE MyTable3" +
                    "(" +
                    "Word TEXT" +
                    ", Mean TEXT" +
                    ")"
        )

        db.execSQL(
            "CREATE TABLE MyTable4" +
                    "(" +
                    "Word TEXT" +
                    ", Mean TEXT" +
                    ")"
        )

        db.execSQL(
            "CREATE TABLE MyTable5" +
                    "(" +
                    "Word TEXT" +
                    ", Mean TEXT" +
                    ")"
        )

        db.execSQL(
            "CREATE TABLE MyTable6" +
                    "(" +
                    "Word TEXT" +
                    ", Mean TEXT" +
                    ")"
        )

        db.execSQL(
            "CREATE TABLE MyTable7" +
                    "(" +
                    "Word TEXT" +
                    ", Mean TEXT" +
                    ")"
        )

        db.execSQL(
            "CREATE TABLE MyTable8" +
                    "(" +
                    "Word TEXT" +
                    ", Mean TEXT" +
                    ")"
        )

        db.execSQL("INSERT INTO MyTable1 VALUES('ウル、ウルク','シュメール人の都市国家二つ')")
        db.execSQL("INSERT INTO MyTable1 VALUES('ジッグラト','シュメール人によって建設された聖塔')")
        db.execSQL("INSERT INTO MyTable1 VALUES('アッカド人','シュメール人を滅ぼし、メソポタミアを統一（前2400）')")
        db.execSQL("INSERT INTO MyTable1 VALUES('ハンムラビ王','古バビロニアの王')")
        db.execSQL("INSERT INTO MyTable1 VALUES('アムル人','古バビロニア王国をおこしたのはセム系＝＝＝人')")
        db.execSQL("INSERT INTO MyTable1 VALUES('同害復讐法、身分法','ハンムラビ法典の特徴２つ')")
        db.execSQL("INSERT INTO MyTable1 VALUES('ヒッタイト','古バビロニア王国を滅ぼしたのは')")
        db.execSQL("INSERT INTO MyTable1 VALUES('ヒッタイト','はじめて鉄器を使用した')")
        db.execSQL("INSERT INTO MyTable1 VALUES('インド＝ヨーロッパ語族','ヒッタイトは何語族？')")
        db.execSQL("INSERT INTO MyTable1 VALUES('フェニキア人','前1200頃地中海貿易に従事したのは')")
        db.execSQL("INSERT INTO MyTable1 VALUES('アラム人','前1200頃内陸貿易に従事したのは')")
        db.execSQL("INSERT INTO MyTable1 VALUES('シドン・ティルス','フェニキア人の都市国家')")
        db.execSQL("INSERT INTO MyTable1 VALUES('ダマスクス','アラム人の都市国家')")
        db.execSQL("INSERT INTO MyTable1 VALUES('ヘロドトス','エジプトはナイルの賜物といった古代ギリシアの歴史家')")
        db.execSQL("INSERT INTO MyTable1 VALUES('メンフィス','エジプト古王国の都')")
        db.execSQL("INSERT INTO MyTable1 VALUES('テーベ','エジプト中王国の都')")
        db.execSQL("INSERT INTO MyTable1 VALUES('テーベ','エジプト新王国の都')")
        db.execSQL("INSERT INTO MyTable1 VALUES('ヒクソス','エジプト中王国のときに馬と戦車を操り侵入してきたのは')")
        db.execSQL("INSERT INTO MyTable1 VALUES('アメンホテプ４世','新王国時代に宗教改革を断行したファラオ')")
        db.execSQL("INSERT INTO MyTable1 VALUES('テーベからテル＝エル＝アマルナ','アメンホテプ４世はどこからどこに遷都したか')")
        db.execSQL("INSERT INTO MyTable1 VALUES('イクナートン','アメンホテプ４世は自らの名前を改称')")
        db.execSQL("INSERT INTO MyTable1 VALUES('アマルナ美術','アメンホテプ４世の宗教改革の時期に栄えた写実的な美術')")
        db.execSQL("INSERT INTO MyTable1 VALUES('アトン','アメンホテプ４世は、アメン神から＝＝＝神へ信仰の対象を変えた')")
        db.execSQL("INSERT INTO MyTable1 VALUES('シャンポリオン','ロゼッタ＝ストーンの解読をしたフランス人')")
        db.execSQL("INSERT INTO MyTable1 VALUES('ヒエログリフ','神聖文字')")
        db.execSQL("INSERT INTO MyTable1 VALUES('ヒエラティック','神官文字')")
        db.execSQL("INSERT INTO MyTable1 VALUES('デモティック','民用文字')")
        db.execSQL("INSERT INTO MyTable1 VALUES('アッシリア','前６７１年　オリエントを統一したのは')")
        db.execSQL("INSERT INTO MyTable1 VALUES('ニネヴェ','アッシリアの首都')")
        db.execSQL("INSERT INTO MyTable1 VALUES('リディア','アッシリア滅亡後アナトリア高原（小アジア）を勢力地とした')")
        db.execSQL("INSERT INTO MyTable1 VALUES('メディア','アッシリア滅亡後イラン高原を勢力地とした')")
        db.execSQL("INSERT INTO MyTable1 VALUES('リディア','世界で初めて鋳造貨幣を使用')")
        db.execSQL("INSERT INTO MyTable1 VALUES('新バビロニア王国','アッシリア滅亡後メソポタミアを勢力地とした')")
        db.execSQL("INSERT INTO MyTable1 VALUES('ネブカドネザル２世','バビロン捕囚を行った新バビロニアの王')")
        db.execSQL("INSERT INTO MyTable1 VALUES('新バビロニア王国、ネブカドネザル２世','ユダ王国を滅ぼしたのはどこの国？誰？')")
        db.execSQL("INSERT INTO MyTable1 VALUES('モーセ','出エジプトのヘブライ人たちの指導者')")
        db.execSQL("INSERT INTO MyTable1 VALUES('ダヴィデ王','ヘブライ王国第二代の王')")
        db.execSQL("INSERT INTO MyTable1 VALUES('ソロモン','ヘブライ王国第三代の王、エルサレムに神殿を建設、最盛期')")
        db.execSQL("INSERT INTO MyTable1 VALUES('北のイスラエル王国、南のユダ王国','ヘブライ王国はソロモン王死後二つに分裂')")
        db.execSQL("INSERT INTO MyTable1 VALUES('ユダ王国','新バビロニア王国に滅ぼされたのは')")
        db.execSQL("INSERT INTO MyTable1 VALUES('前586～前538（ハローご参拝）','バビロン捕囚は何年から何年？')")
        db.execSQL("INSERT INTO MyTable1 VALUES('キュロス２世','アケメネス朝ペルシアの創始者')")
        db.execSQL("INSERT INTO MyTable1 VALUES('ダレイオス１世','アケメネス朝ペルシアの全盛時代の王')")
        db.execSQL("INSERT INTO MyTable1 VALUES('サトラップ','アケメネス朝が全国に置いた知事')")
        db.execSQL("INSERT INTO MyTable1 VALUES('王の目・王の耳','アケメネス朝ペルシアで知事を監督する監察官')")
        db.execSQL("INSERT INTO MyTable1 VALUES('王の道','アケメネス朝ペルシアで整備された国道。')")
        db.execSQL("INSERT INTO MyTable1 VALUES('スサからサルデス','王の道は＝＝から＝＝＝＝まで')")
        db.execSQL("INSERT INTO MyTable1 VALUES('スサ','アケメネス朝の行政上の首都')")
        db.execSQL("INSERT INTO MyTable1 VALUES('ペルセポリス','ダレイオス１世が建設した新都')")
        db.execSQL("INSERT INTO MyTable1 VALUES('ゾロアスター教','古代のイランで成立した宗教')")
        db.execSQL("INSERT INTO MyTable1 VALUES('祆教','ゾロアスター教は中国に伝わり○○と呼ばれた')")
        db.execSQL("INSERT INTO MyTable1 VALUES('アフラ＝マズダ','ゾロアスター教の善神')")
        db.execSQL("INSERT INTO MyTable1 VALUES('アーリマン','ゾロアスター教の悪神')")
        db.execSQL("INSERT INTO MyTable1 VALUES('アレクサンドロス大王の東征','アケメネス朝滅亡の原因')")
        db.execSQL("INSERT INTO MyTable1 VALUES('ベヒストゥン碑文','楔形文字解読のきっかけとなった碑文')")
        db.execSQL("INSERT INTO MyTable1 VALUES('ローリンソン','ベヒストゥン碑文を解読したのは')")
        db.execSQL("INSERT INTO MyTable1 VALUES('パルティア','セレウコス朝シリアからイラン系民族が独立して建国')")
        db.execSQL("INSERT INTO MyTable1 VALUES('クテシフォン','ササン朝、パルティアの首都')")
        db.execSQL("INSERT INTO MyTable1 VALUES('アヴェスター','ゾロアスター教の聖典')")
        db.execSQL("INSERT INTO MyTable1 VALUES('シャープール１世','ササン朝の王、ローマ皇帝ヴァレリアヌスを捕虜')")
        db.execSQL("INSERT INTO MyTable1 VALUES('ホスロー１世','ササン朝の王、東ローマ皇帝ユスティニアヌスと抗争')")
        db.execSQL("INSERT INTO MyTable1 VALUES('ユスティニアヌス','ホスロー１世と抗争した東ローマ皇帝')")
        db.execSQL("INSERT INTO MyTable1 VALUES('ササン朝','ゾロアスター教を国教とした王朝')")
        db.execSQL("INSERT INTO MyTable1 VALUES('突厥','ホスロー１世は＝＝と結んでエフタルを滅ぼす')")

        db.execSQL("INSERT INTO MyTable2 VALUES('クノッソス宮殿','クレタ文明の宮殿')")
        db.execSQL("INSERT INTO MyTable2 VALUES('線文字A','クレタ文明の文字')")
        db.execSQL("INSERT INTO MyTable2 VALUES('線文字B','ミケーネ文明の文字')")
        db.execSQL("INSERT INTO MyTable2 VALUES('ヴェントリス','線文字Ｂの解読')")
        db.execSQL("INSERT INTO MyTable2 VALUES('されていない','線文字Ａの解読は？')")
        db.execSQL("INSERT INTO MyTable2 VALUES('ミケーネ文明','戦闘的、獅子門、城壁あり（エーゲ文明）')")
        db.execSQL("INSERT INTO MyTable2 VALUES('クレタ文明','平和的、海洋文明（エーゲ文明）')")
        db.execSQL("INSERT INTO MyTable2 VALUES('クレタ文明、ミケーネ文明、トロイア文明','エーゲ文明３つ')")
        db.execSQL("INSERT INTO MyTable2 VALUES('エヴァンズ','クレタ文明の発掘者')")
        db.execSQL("INSERT INTO MyTable2 VALUES('シュリーマン','ミケーネ文明の発掘者')")
        db.execSQL("INSERT INTO MyTable2 VALUES('シュリーマン','トロイア文明の発掘者')")
        db.execSQL("INSERT INTO MyTable2 VALUES('リュクルゴス','スパルタの伝説的立法者')")
        db.execSQL("INSERT INTO MyTable2 VALUES('海の民の侵入','ミケーネ文明の滅んだ原因')")
        db.execSQL("INSERT INTO MyTable2 VALUES('アクロポリス','神殿などが建てられた丘')")
        db.execSQL("INSERT INTO MyTable2 VALUES('アゴラ','広場')")
        db.execSQL("INSERT INTO MyTable2 VALUES('イオニア人','アテネはなに人のポリス？')")
        db.execSQL("INSERT INTO MyTable2 VALUES('ドーリア人','スパルタはなに人のポリス？')")
        db.execSQL("INSERT INTO MyTable2 VALUES('ペリオイコイ','スパルタの劣格市民')")
        db.execSQL("INSERT INTO MyTable2 VALUES('ヘイロータイ','スパルタの奴隷')")
        db.execSQL("INSERT INTO MyTable2 VALUES('奴隷（スパルタ）','ヘイロータイ')")
        db.execSQL("INSERT INTO MyTable2 VALUES('劣格市民（スパルタ）','ペリオイコイ')")
        db.execSQL("INSERT INTO MyTable2 VALUES('青銅器','ミケーネ文明は鉄器？青銅器？')")
        db.execSQL("INSERT INTO MyTable2 VALUES('オリンポス１２神','ギリシア人たちが崇めた神々')")
        db.execSQL("INSERT INTO MyTable2 VALUES('ドラコン立法','慣習法を成文化')")
        db.execSQL("INSERT INTO MyTable2 VALUES('ソロン','債務奴隷の禁止、財産政治')")
        db.execSQL("INSERT INTO MyTable2 VALUES('債務奴隷の禁止、財産政治','ソロンの改革の内容二つ')")
        db.execSQL("INSERT INTO MyTable2 VALUES('平民、貴族双方から不満が出て調停は失敗','ソロンの改革の結果')")
        db.execSQL("INSERT INTO MyTable2 VALUES('ペイシストラトス','中小農民の支持を背景に出現し僭主となった人物')")
        db.execSQL("INSERT INTO MyTable2 VALUES('クレイステネス','民主政の基礎')")
        db.execSQL("INSERT INTO MyTable2 VALUES('クレイステネス','陶片追放')")
        db.execSQL("INSERT INTO MyTable2 VALUES('クレイステネス','部族制の解体')")
        db.execSQL("INSERT INTO MyTable2 VALUES('オストラキスモス（陶片追放）、部族制の解体','クレイステネスの改革を２つ')")
        db.execSQL("INSERT INTO MyTable2 VALUES('イオニアの植民市の反乱','ペルシア戦争の原因')")
        db.execSQL("INSERT INTO MyTable2 VALUES('サラミスの海戦','ペルシア戦争で無産市民が活躍し参政権を得るきっかけとなった')")
        db.execSQL("INSERT INTO MyTable2 VALUES('前４８０','サラミスの海戦は何年')")
        db.execSQL("INSERT INTO MyTable2 VALUES('無産市民が船の漕ぎ手として活躍し、参政権を得るきっかけとなった。','サラミスの海戦の結果')")
        db.execSQL("INSERT INTO MyTable2 VALUES('抽選','ペリクレス時代、公職は（　　　）で決まった')")
        db.execSQL("INSERT INTO MyTable2 VALUES('１８歳以上の成年男子市民すべて','ペリクレス時代の民会の参加資格')")
        db.execSQL("INSERT INTO MyTable2 VALUES('ペリクレス','アテネの民主政が完成したときの指導者')")
        db.execSQL("INSERT INTO MyTable2 VALUES('奴隷と女性','アテネの民主政で、参政権を認められなかったのは')")
        db.execSQL("INSERT INTO MyTable2 VALUES('デロス同盟','アテネを中心として結成、ペルシアの襲来に備える、実質アテネの覇権')")
        db.execSQL("INSERT INTO MyTable2 VALUES('アテネ','デロス同盟の中心となったポリス')")
        db.execSQL("INSERT INTO MyTable2 VALUES('ペロポネソス同盟','反アテネでスパルタを中心に成立した同盟')")
        db.execSQL("INSERT INTO MyTable2 VALUES('スパルタ','ペロポネソス同盟の中心となったポリス')")
        db.execSQL("INSERT INTO MyTable2 VALUES('ペロポネソス戦争','アテネとスパルタの対立から前431に始まった戦争')")
        db.execSQL("INSERT INTO MyTable2 VALUES('スパルタ','ペロポネソス戦争で勝利したのは')")
        db.execSQL("INSERT INTO MyTable2 VALUES('レウクトラの戦い','スパルタがテーベに敗れ覇権を失った戦い')")
        db.execSQL("INSERT INTO MyTable2 VALUES('衆愚政治','ペロポネソス戦争敗北後アテネは＝＝＝＝に陥る')")
        db.execSQL("INSERT INTO MyTable2 VALUES('デマゴーゴス（扇動政治家）','ペロポネソス中に現れ、過激な意見で大衆を扇動した政治家')")
        db.execSQL("INSERT INTO MyTable2 VALUES('カイロネイアの戦い','フィリッポス２世がアテネ・テーベ連合軍を撃破')")
        db.execSQL("INSERT INTO MyTable2 VALUES('コリントス同盟','マケドニアのギリシア諸ポリスの支配のための同盟')")
        db.execSQL("INSERT INTO MyTable2 VALUES('フィリッポス２世','カイロネイアの戦いで勝利したマケドニアの王')")

        db.execSQL("INSERT INTO MyTable3 VALUES('フェイディアス','パルテノン神殿の建築')")
        db.execSQL("INSERT INTO MyTable3 VALUES('バルバロイ','異民族「聞き苦しい言葉を話す人」')")
        db.execSQL("INSERT INTO MyTable3 VALUES('ヘレネス','ギリシア人が自分たちのことをこう呼んだ')")
        db.execSQL("INSERT INTO MyTable3 VALUES('ホメロス','叙事詩『イリアス」『オデュッセイア』')")
        db.execSQL("INSERT INTO MyTable3 VALUES('ヘシオドス','神統記、労働と日々')")
        db.execSQL("INSERT INTO MyTable3 VALUES('アリストファネス','女の平和')")
        db.execSQL("INSERT INTO MyTable3 VALUES('オイディプス','ソフォクレス')")
        db.execSQL("INSERT INTO MyTable3 VALUES('ソクラテス','無知の知')")
        db.execSQL("INSERT INTO MyTable3 VALUES('アガメムノン','アイスキュロス')")
        db.execSQL("INSERT INTO MyTable3 VALUES('プラトン','イデア論')")
        db.execSQL("INSERT INTO MyTable3 VALUES('プラトン','アカデメイア')")
        db.execSQL("INSERT INTO MyTable3 VALUES('アリストテレス','リュケイオン')")
        db.execSQL("INSERT INTO MyTable3 VALUES('アリストテレス','二コマコス倫理学')")
        db.execSQL("INSERT INTO MyTable3 VALUES('アリストテレス','諸学の分類、万学の祖')")
        db.execSQL("INSERT INTO MyTable3 VALUES('ソクラテス','問答法（産婆術）')")
        db.execSQL("INSERT INTO MyTable3 VALUES('ヘロドトス','物語的に歴史を叙述')")
        db.execSQL("INSERT INTO MyTable3 VALUES('トゥキュディデス','科学的に歴史を叙述')")
        db.execSQL("INSERT INTO MyTable3 VALUES('ヘロドトス','ペルシア戦争史')")
        db.execSQL("INSERT INTO MyTable3 VALUES('トゥキュディデス','ペロポネソス戦争史')")
        db.execSQL("INSERT INTO MyTable3 VALUES('サッフォー','美や愛をテーマにした女流詩人')")
        db.execSQL("INSERT INTO MyTable3 VALUES('ソフィスト','弁論を教える職業家庭教師')")
        db.execSQL("INSERT INTO MyTable3 VALUES('プロタゴラス','代表的なソフィスト')")
        db.execSQL("INSERT INTO MyTable3 VALUES('プロタゴラス','人間は万物の尺度')")
        db.execSQL("INSERT INTO MyTable3 VALUES('ピタゴラス','万物の根源は数')")
        db.execSQL("INSERT INTO MyTable3 VALUES('ヘラクレイトス','万物の根源は火')")
        db.execSQL("INSERT INTO MyTable3 VALUES('ヘラクレイトス','万物は流転する')")
        db.execSQL("INSERT INTO MyTable3 VALUES('タレス','万物の根源は水')")
        db.execSQL("INSERT INTO MyTable3 VALUES('タレス','日食を予言')")
        db.execSQL("INSERT INTO MyTable3 VALUES('デモクリトス','万物の根源は原子')")
        db.execSQL("INSERT INTO MyTable3 VALUES('アリスタルコス','ヘレニズム、太陽中心説')")
        db.execSQL("INSERT INTO MyTable3 VALUES('エウクレイデス','ヘレニズム、幾何学を大成')")
        db.execSQL("INSERT INTO MyTable3 VALUES('アルキメデス','ヘレニズム、浮体の原理、てこの原理')")
        db.execSQL("INSERT INTO MyTable3 VALUES('エラトステネス','ヘレニズム、ムセイオン館長、地球の外周を計測')")
        db.execSQL("INSERT INTO MyTable3 VALUES('ゼノン','ヘレニズム、ストア派の祖')")
        db.execSQL("INSERT INTO MyTable3 VALUES('コイネー','ヘレニズム、ギリシア語は何と呼ばれた')")
        db.execSQL("INSERT INTO MyTable3 VALUES('アレクサンドリア','ムセイオンはどこにある？')")
        db.execSQL("INSERT INTO MyTable3 VALUES('ギリシア語','ムセイオンでは何語で研究していた？')")
        db.execSQL("INSERT INTO MyTable3 VALUES('セレウコス朝シリア','アレクサンドロス死後、シリアは？')")
        db.execSQL("INSERT INTO MyTable3 VALUES('アンティゴノス朝マケドニア','アレクサンドロス死後、ギリシアは？')")
        db.execSQL("INSERT INTO MyTable3 VALUES('プトレマイオス朝エジプト','アレクサンドロス死後、エジプトは？')")
        db.execSQL("INSERT INTO MyTable3 VALUES('ディアドコイ','アレクサンドロスの後継者')")
        db.execSQL("INSERT INTO MyTable3 VALUES('インダス川','アレクサンドロスの東征はどこまで？')")
        db.execSQL("INSERT INTO MyTable3 VALUES('ラオコーン、ミロのヴィーナス','ヘレニズム、代表的彫刻２つ')")
        db.execSQL("INSERT INTO MyTable3 VALUES('コスモポリタニズム','ポリスの枠を越えて人々が結びつく、ヘレニズムの風潮')")
        db.execSQL("INSERT INTO MyTable3 VALUES('パルティア','セレウコス朝からイラン人たちが独立')")
        db.execSQL("INSERT INTO MyTable3 VALUES('バクトリア','セレウコス朝からアフガニスタンでギリシア系住民が独立')")

        db.execSQL("INSERT INTO MyTable4 VALUES('エトルリア人','前６世紀なに人の王を追放')")
        db.execSQL("INSERT INTO MyTable4 VALUES('コンスル','執政官のこと')")
        db.execSQL("INSERT INTO MyTable4 VALUES('平民','重装歩兵の担い手、プレブス')")
        db.execSQL("INSERT INTO MyTable4 VALUES('護民官','聖山事件を機に平民を守る権限を持つ官職設置')")
        db.execSQL("INSERT INTO MyTable4 VALUES('ディクタトル','共和政ローマの非常時の独裁官')")
        db.execSQL("INSERT INTO MyTable4 VALUES('十二表法','慣習法を成文化')")
        db.execSQL("INSERT INTO MyTable4 VALUES('十二表法','貴族による法の独占を阻止')")
        db.execSQL("INSERT INTO MyTable4 VALUES('リキニウス・セクスティウス法','コンスルのうち一人は平民から選出')")
        db.execSQL("INSERT INTO MyTable4 VALUES('リキニウス・セクスティウス法','大土地所有を禁止、貴族の大土地所有を防いだ')")
        db.execSQL("INSERT INTO MyTable4 VALUES('ホルテンシウス法','平民会の議決が国の議決となる')")
        db.execSQL("INSERT INTO MyTable4 VALUES('平民会の議決が国の議決となる','ホルテンシウス法の内容')")
        db.execSQL("INSERT INTO MyTable4 VALUES('リキニウス・セクスティウス法','ＢＣ３６７')")
        db.execSQL("INSERT INTO MyTable4 VALUES('ホルテンシウス法','ＢＣ２８７')")
        db.execSQL("INSERT INTO MyTable4 VALUES('ノビレス','共和政期の富裕市民')")
        db.execSQL("INSERT INTO MyTable4 VALUES('ロムルスとレムス','ローマの建国神話の双子の兄弟')")
        db.execSQL("INSERT INTO MyTable4 VALUES('前２７２','イタリア半島の統一の年号')")
        db.execSQL("INSERT INTO MyTable4 VALUES('カルタゴ（場所を確認せよ）','北アフリカのフェニキアの植民市')")
        db.execSQL("INSERT INTO MyTable4 VALUES('シチリア島および地中海の覇権争い','ポエニ戦争の原因')")
        db.execSQL("INSERT INTO MyTable4 VALUES('アルキメデス','第２回ポエニ戦争で殺されたシチリアの物理学者')")
        db.execSQL("INSERT INTO MyTable4 VALUES('シチリア島','ローマ初の属州')")
        db.execSQL("INSERT INTO MyTable4 VALUES('ポエニ戦争によって','ローマが地中海の制海権を握ったのは')")
        db.execSQL("INSERT INTO MyTable4 VALUES('ハンニバル','アルプスを越えてローマを背後から急襲したカルタゴの将軍')")
        db.execSQL("INSERT INTO MyTable4 VALUES('カンネーの戦い','ハンニバルがローマを撃破した戦い')")
        db.execSQL("INSERT INTO MyTable4 VALUES('大スキピオ','その後ハンニバルを破ったローマの将軍')")
        db.execSQL("INSERT INTO MyTable4 VALUES('ザマの戦い','スキピオがカルタゴを破った戦い')")
        db.execSQL("INSERT INTO MyTable4 VALUES('ラティフンディウム','奴隷を使用した大土地農場')")
        db.execSQL("INSERT INTO MyTable4 VALUES('安価な穀物が流入','ラティフンディアの発達によってローマに・・・')")
        db.execSQL("INSERT INTO MyTable4 VALUES('中小農民','ラティフンディアの発達によって（　　　　）が没落')")
        db.execSQL("INSERT INTO MyTable4 VALUES('グラックス兄弟の改革','ラティフンディアの発達のなかで公有地の占有を制限する改革を試みた人物')")
        db.execSQL("INSERT INTO MyTable4 VALUES('グラックス兄弟の改革失敗','「内乱の１世紀」の始まり')")
        db.execSQL("INSERT INTO MyTable4 VALUES('マリウス','平民派と閥族派の対立、平民派の指導者')")
        db.execSQL("INSERT INTO MyTable4 VALUES('スラ','平民派と閥族派の対立、閥族派の指導者')")
        db.execSQL("INSERT INTO MyTable4 VALUES('同盟市戦争','イタリアの同盟市がローマ市民権を要求')")
        db.execSQL("INSERT INTO MyTable4 VALUES('剣奴スパルタクスの乱','剣奴の反乱')")
        db.execSQL("INSERT INTO MyTable4 VALUES('前１世紀','内乱の１世紀は世紀でいうといつ')")
        db.execSQL("INSERT INTO MyTable4 VALUES('ポンペイウス、カエサル、クラッスス','第一回三頭政治３人')")
        db.execSQL("INSERT INTO MyTable4 VALUES('ポンペイウス','第一回三頭政治、スラの後継者、スパルタクスの乱鎮圧、ヒスパニア、オリエント遠征')")
        db.execSQL("INSERT INTO MyTable4 VALUES('カエサル','ガリア遠征')")
        db.execSQL("INSERT INTO MyTable4 VALUES('クラッスス','第一回三頭政治、シリアを勢力圏、パルティア遠征で戦死')")
        db.execSQL("INSERT INTO MyTable4 VALUES('インペラトル','カエサルが元老院から事実上の権力者として与えられた称号')")
        db.execSQL("INSERT INTO MyTable4 VALUES('ユリウス暦','カエサルのつくった暦')")
        db.execSQL("INSERT INTO MyTable4 VALUES('ブルートゥス','カエサルを暗殺したのは')")
        db.execSQL("INSERT INTO MyTable4 VALUES('オクタヴィアヌス、アントニウス、レピドゥス','第二回三頭政治３人')")
        db.execSQL("INSERT INTO MyTable4 VALUES('アントニウス','カエサルの部将')")
        db.execSQL("INSERT INTO MyTable4 VALUES('オクタヴィアヌス','カエサルの養子')")
        db.execSQL("INSERT INTO MyTable4 VALUES('プトレマイオス朝エジプト','クレオパトラはどこの王朝の女王')")
        db.execSQL("INSERT INTO MyTable4 VALUES('アクティウムの海戦','クレオパトラとアントニウスとオクタヴィアヌスが戦った')")

        db.execSQL("INSERT INTO MyTable5 VALUES('アウグストゥスの元首政','ローマの帝政はいつから？')")
        db.execSQL("INSERT INTO MyTable5 VALUES('アウグストゥス','オクタヴィアヌスが元老院から与えられた称号（尊厳者）')")
        db.execSQL("INSERT INTO MyTable5 VALUES('元首政','アウグストゥスは共和政の第一人者として政治をする、この政治')")
        db.execSQL("INSERT INTO MyTable5 VALUES('ネロ','家庭教師のセネカを殺害、キリスト教を迫害')")
        db.execSQL("INSERT INTO MyTable5 VALUES('ネルヴァ、トラヤヌス、ハドリアヌス、アントニヌス＝ピウス、マルクス＝アウレリウス＝アントニヌス','ローマの五賢帝５人')")
        db.execSQL("INSERT INTO MyTable5 VALUES('元首政から五賢帝','パクス＝ロマーナの時期はいつからいつ')")
        db.execSQL("INSERT INTO MyTable5 VALUES('トラヤヌス','ローマの最大領土の時の皇帝')")
        db.execSQL("INSERT INTO MyTable5 VALUES('ハドリアヌス','ブリタニアに壁を築く')")
        db.execSQL("INSERT INTO MyTable5 VALUES('ドナウ川','トラヤヌスが○○○川を越えてダキアを征服')")
        db.execSQL("INSERT INTO MyTable5 VALUES('ダキア','トラヤヌス時代の最大領土、どこを征服')")
        db.execSQL("INSERT INTO MyTable5 VALUES('トイトブルク森の戦い','ゲルマン人とローマ人が衝突した戦い')")
        db.execSQL("INSERT INTO MyTable5 VALUES('優位','軍人皇帝時代は属州が・・・')")
        db.execSQL("INSERT INTO MyTable5 VALUES('揺らぐ','軍人皇帝時代はローマの優位が・・')")
        db.execSQL("INSERT INTO MyTable5 VALUES('コロナートゥス','五賢帝時代から軍人皇帝時代にかけて、小作人をつかった農場経営')")
        db.execSQL("INSERT INTO MyTable5 VALUES('ディオクレティアヌス','軍人皇帝時代を収束させた皇帝')")
        db.execSQL("INSERT INTO MyTable5 VALUES('ドミナートゥス','ディオクレティアヌスがはじめた東方的専制体制')")
        db.execSQL("INSERT INTO MyTable5 VALUES('ディオクレティアヌス','帝国を四分割統治したのは')")
        db.execSQL("INSERT INTO MyTable5 VALUES('ディオクレティアヌス','皇帝崇拝の強要')")
        db.execSQL("INSERT INTO MyTable5 VALUES('ディオクレティアヌス','キリスト教の大迫害（ネロ以外で）')")
        db.execSQL("INSERT INTO MyTable5 VALUES('３世紀後半','ディオクレティアヌスは何世紀ごろ')")
        db.execSQL("INSERT INTO MyTable5 VALUES('４世紀前半','コンスタンティヌス帝は何世紀ごろ')")
        db.execSQL("INSERT INTO MyTable5 VALUES('コンスタンティヌス帝','コンスタンティノープルに遷都したローマ皇帝')")
        db.execSQL("INSERT INTO MyTable5 VALUES('コンスタンティヌス帝','コロヌスの移動を禁じたローマ皇帝')")
        db.execSQL("INSERT INTO MyTable5 VALUES('コンスタンティヌス帝','キリスト教を公認したローマ皇帝')")
        db.execSQL("INSERT INTO MyTable5 VALUES('ミラノ勅令','キリスト教を公認した勅令')")
        db.execSQL("INSERT INTO MyTable5 VALUES('313','ミラノ勅令は何年')")
        db.execSQL("INSERT INTO MyTable5 VALUES('ニケーア公会議','コンスタンティヌスが３２５開いた公会議')")
        db.execSQL("INSERT INTO MyTable5 VALUES('アリウス派','ニケーア公会議で異端は？')")
        db.execSQL("INSERT INTO MyTable5 VALUES('ニケーア公会議','アリウス派が異端となった公会議')")
        db.execSQL("INSERT INTO MyTable5 VALUES('アタナシウス派','ニケーア公会議で正統')")
        db.execSQL("INSERT INTO MyTable5 VALUES('アタナシウス派','エフェソス公会議で正統')")
        db.execSQL("INSERT INTO MyTable5 VALUES('ネストリウス派','エフェソス公会議で異端')")
        db.execSQL("INSERT INTO MyTable5 VALUES('エフェソス公会議','ネストリウス派が異端となった公会議')")
        db.execSQL("INSERT INTO MyTable5 VALUES('ゲルマン人','アリウス派はどこに広まったか')")
        db.execSQL("INSERT INTO MyTable5 VALUES('シリア、イラン、中国など東方世界','ネストリウス派はどこに広まったか')")
        db.execSQL("INSERT INTO MyTable5 VALUES('テオドシウス帝','キリスト教を国教にしたローマ皇帝')")
        db.execSQL("INSERT INTO MyTable5 VALUES('395','ローマ帝国の東西分裂何年')")
        db.execSQL("INSERT INTO MyTable5 VALUES('テオドシウス帝','ローマ帝国の東西分裂は何帝の死後')")
        db.execSQL("INSERT INTO MyTable5 VALUES('476','西ローマ帝国の滅亡の年号')")
        db.execSQL("INSERT INTO MyTable5 VALUES('オドアケル','西ローマ帝国を滅ぼしたゲルマン人傭兵')")
        db.execSQL("INSERT INTO MyTable5 VALUES('1453','東ローマ帝国滅亡の年号')")
        db.execSQL("INSERT INTO MyTable5 VALUES('１世紀～２世紀','新約聖書の成立')")
        db.execSQL("INSERT INTO MyTable5 VALUES('パウロ','キリスト教布教、教義の普遍化、世界宗教化')")
        db.execSQL("INSERT INTO MyTable5 VALUES('ペテロ','キリスト教会の組織化')")
        db.execSQL("INSERT INTO MyTable5 VALUES('プリニウス','博物誌')")
        db.execSQL("INSERT INTO MyTable5 VALUES('パンテオン','万神殿')")
        db.execSQL("INSERT INTO MyTable5 VALUES('コロッセオ','円形闘技場')")
        db.execSQL("INSERT INTO MyTable5 VALUES('ヴェルギリウス','アエネイス')")
        db.execSQL("INSERT INTO MyTable5 VALUES('タキトゥス','ゲルマニア')")
        db.execSQL("INSERT INTO MyTable5 VALUES('ストラボン','地理誌')")
        db.execSQL("INSERT INTO MyTable5 VALUES('プルタルコス','対比列伝')")
        db.execSQL("INSERT INTO MyTable5 VALUES('プトレマイオス','天文学大全、天動説、')")
        db.execSQL("INSERT INTO MyTable5 VALUES('リヴィウス','ローマ建国史')")
        db.execSQL("INSERT INTO MyTable5 VALUES('ポリュビオス','政体循環史説')")
        db.execSQL("INSERT INTO MyTable5 VALUES('対比列伝','プルタルコス')")
        db.execSQL("INSERT INTO MyTable5 VALUES('セネカ','ストア派哲学、ネロの師')")
        db.execSQL("INSERT INTO MyTable5 VALUES('キケロ','散文家、国家論など')")
        db.execSQL("INSERT INTO MyTable5 VALUES('カタコンベ','キリスト教徒が弾圧を逃れて活動した地下墓所')")

        db.execSQL("INSERT INTO MyTable6 VALUES('ハラッパー','インダス文明、インダス川上流')")
        db.execSQL("INSERT INTO MyTable6 VALUES('モエンジョ＝ダーロ','インダス文明、インダス川下流')")
        db.execSQL("INSERT INTO MyTable6 VALUES('されていない','インダス文字の解読は')")
        db.execSQL("INSERT INTO MyTable6 VALUES('印章','インダス文明の遺跡からは○○が出土した')")
        db.execSQL("INSERT INTO MyTable6 VALUES('ドラヴィダ人','インダス文明を築いたのはなに人')")
        db.execSQL("INSERT INTO MyTable6 VALUES('青銅器','インダス文明は～器文明')")
        db.execSQL("INSERT INTO MyTable6 VALUES('BC１５００','アーリア人の侵入はいつごろ？')")
        db.execSQL("INSERT INTO MyTable6 VALUES('カイバル峠','アーリア人が越えてきた峠')")
        db.execSQL("INSERT INTO MyTable6 VALUES('インド＝ヨーロッパ語族','アーリア人は何語族')")
        db.execSQL("INSERT INTO MyTable6 VALUES('リグ＝ヴェーダ','インド最古の聖典')")
        db.execSQL("INSERT INTO MyTable6 VALUES('サンスクリット語','ヴェーダは何語で書かれている')")
        db.execSQL("INSERT INTO MyTable6 VALUES('バラモン教','ヴェーダの神々を崇める宗教成立')")
        db.execSQL("INSERT INTO MyTable6 VALUES('アーリア人がガンジス中流に移動した 前１０００年頃','インドにおける鉄器の使用時期')")
        db.execSQL("INSERT INTO MyTable6 VALUES('ガンジス川中流に移動','インダス文明を滅ぼしたアーリア人はその後？（ＢＣ１０００頃）')")
        db.execSQL("INSERT INTO MyTable6 VALUES('前１０００頃','ヴェーダの成立時期')")
        db.execSQL("INSERT INTO MyTable6 VALUES('ヴァルナ','姓種')")
        db.execSQL("INSERT INTO MyTable6 VALUES('バラモン、クシャトリア、ヴァイシャ、シュードラ','ヴァルナ制の４つの身分')")
        db.execSQL("INSERT INTO MyTable6 VALUES('ジャーティー','職業集団')")
        db.execSQL("INSERT INTO MyTable6 VALUES('クシャトリア','ヴァルナ制の武士・貴族は')")
        db.execSQL("INSERT INTO MyTable6 VALUES('前６世紀頃','バラモン教が祭式万能主義に陥り、新しい思想が生まれる時期')")
        db.execSQL("INSERT INTO MyTable6 VALUES('ウパニシャッド哲学','バラモン教の奥義書、梵我一如')")
        db.execSQL("INSERT INTO MyTable6 VALUES('梵＝ブラフマン、我＝アートマン','梵とは、我とは')")
        db.execSQL("INSERT INTO MyTable6 VALUES('ガウタマ＝シッダールタ','八正道を唱えた')")
        db.execSQL("INSERT INTO MyTable6 VALUES('否定','仏教はヴァルナ制を…')")
        db.execSQL("INSERT INTO MyTable6 VALUES('クシャトリア','仏教を支持した身分')")
        db.execSQL("INSERT INTO MyTable6 VALUES('ガウタマ＝シッダールタ','仏教の創始者')")
        db.execSQL("INSERT INTO MyTable6 VALUES('ヴァルダマーナ','ジャイナ教の創始者')")
        db.execSQL("INSERT INTO MyTable6 VALUES('ジャイナ教','極端な不殺生')")
        db.execSQL("INSERT INTO MyTable6 VALUES('前６世紀頃','ウパニシャッドの時期')")
        db.execSQL("INSERT INTO MyTable6 VALUES('前６世紀頃','仏教、ジャイナ教の時期')")
        db.execSQL("INSERT INTO MyTable6 VALUES('ヴァイシャ','ジャイナ教を支持した身分')")
        db.execSQL("INSERT INTO MyTable6 VALUES('前４世紀、インダス川まで','アレクサンドロスの遠征軍が到達、どこまで、いつごろ？')")
        db.execSQL("INSERT INTO MyTable6 VALUES('チャンドラグプタ','マガダ国の部将がマウリヤ朝を建国')")
        db.execSQL("INSERT INTO MyTable6 VALUES('マウリヤ朝','チャンドラグプタがＢＣ４世紀に建国')")
        db.execSQL("INSERT INTO MyTable6 VALUES('セレウコス朝','マウリヤ朝が抗争した王朝（西側）')")
        db.execSQL("INSERT INTO MyTable6 VALUES('アショーカ王','マウリヤ朝第三代、最盛期')")
        db.execSQL("INSERT INTO MyTable6 VALUES('アショーカ王','カリンガ征服')")
        db.execSQL("INSERT INTO MyTable6 VALUES('アショーカ王','ダルマを刻んだ石柱碑・磨崖碑を建設')")
        db.execSQL("INSERT INTO MyTable6 VALUES('アショーカ王','セイロン島への仏教の伝道')")
        db.execSQL("INSERT INTO MyTable6 VALUES('アショーカ王','第三回仏典結集')")
        db.execSQL("INSERT INTO MyTable6 VALUES('カリンガ','アショーカ王はどこを征服した時、罪にさいなまれ仏教に帰依した？')")
        db.execSQL("INSERT INTO MyTable6 VALUES('石柱碑磨崖碑を建設','アショーカ王が仏教を広めるためにやったのは？')")
        db.execSQL("INSERT INTO MyTable6 VALUES('アショーカ王','サーンチーの仏塔建設')")
        db.execSQL("INSERT INTO MyTable6 VALUES('ストゥーパ','仏塔のこと')")
        db.execSQL("INSERT INTO MyTable6 VALUES('１世紀〜３世紀','クシャーナ朝の時期')")
        db.execSQL("INSERT INTO MyTable6 VALUES('プルシャプラ','クシャーナ朝の都')")
        db.execSQL("INSERT INTO MyTable6 VALUES('カニシカ王','クシャーナ朝の最盛期の王')")
        db.execSQL("INSERT INTO MyTable6 VALUES('１世紀、クシャーナ朝','大乗仏教成立はいつ、王朝は？')")
        db.execSQL("INSERT INTO MyTable6 VALUES('大乗仏教','１世紀、ナーガールジュナが大成')")
        db.execSQL("INSERT INTO MyTable6 VALUES('ナーガールジュナ','大乗仏教の大成者')")
        db.execSQL("INSERT INTO MyTable6 VALUES('中論','ナーガールジュナの著作')")
        db.execSQL("INSERT INTO MyTable6 VALUES('ガンダーラ美術','クシャーナ朝でおこったギリシア風仏教美術')")
        db.execSQL("INSERT INTO MyTable6 VALUES('クシャーナ朝','ガンダーラ美術はいつの王朝')")
        db.execSQL("INSERT INTO MyTable6 VALUES('ギリシア風の仏教美術','ガンダーラ美術とは？')")
        db.execSQL("INSERT INTO MyTable6 VALUES('カニシカ王','第４回仏典結集')")
        db.execSQL("INSERT INTO MyTable6 VALUES('カニシカ王','大乗仏教を手厚く保護した')")
        db.execSQL("INSERT INTO MyTable6 VALUES('サータヴァーハナ朝','ローマとの季節風貿易で繁栄、デカン高原')")

        db.execSQL("INSERT INTO MyTable7 VALUES('大乗仏教','仏教の一派、菩薩信仰')")
        db.execSQL("INSERT INTO MyTable7 VALUES('上座部仏教','仏教の一派、個人の解脱')")
        db.execSQL("INSERT INTO MyTable7 VALUES('上座部仏教','仏教の一派、東南アジアへ')")
        db.execSQL("INSERT INTO MyTable7 VALUES('上座部仏教','仏教の一派、タイやミャンマーで信仰')")
        db.execSQL("INSERT INTO MyTable7 VALUES('１世紀〜３世紀','クシャーナ朝の時期')")
        db.execSQL("INSERT INTO MyTable7 VALUES('プルシャプラ','クシャーナ朝の首都')")
        db.execSQL("INSERT INTO MyTable7 VALUES('カニシカ王','クシャーナ朝の最盛期の王')")
        db.execSQL("INSERT INTO MyTable7 VALUES('１世紀、クシャーナ朝','大乗仏教成立はいつ、王朝は？')")
        db.execSQL("INSERT INTO MyTable7 VALUES('ナーガールジュナ','大乗仏教の大成者')")
        db.execSQL("INSERT INTO MyTable7 VALUES('クシャーナ朝','ガンダーラ美術はいつの王朝')")
        db.execSQL("INSERT INTO MyTable7 VALUES('ギリシア風の仏教美術','ガンダーラ美術とは？')")
        db.execSQL("INSERT INTO MyTable7 VALUES('ガンダーラ美術','クシャーナ朝でおこったギリシア風の仏教美術')")
        db.execSQL("INSERT INTO MyTable7 VALUES('カニシカ王','第４回仏典結集')")
        db.execSQL("INSERT INTO MyTable7 VALUES('カニシカ王','大乗仏教を手厚く保護した')")
        db.execSQL("INSERT INTO MyTable7 VALUES('サータヴァーハナ朝','ローマとの季節風貿易で繁栄、デカン高原')")
        db.execSQL("INSERT INTO MyTable7 VALUES('４世紀','グプタ朝の成立時期')")
        db.execSQL("INSERT INTO MyTable7 VALUES('チャンドラグプタ２世','グプタ朝の最盛期の王')")
        db.execSQL("INSERT INTO MyTable7 VALUES('超日王','グプタ朝のチャンドラグプタ２世は中国ではなんとよばれたか')")
        db.execSQL("INSERT INTO MyTable7 VALUES('法顕','グプタ朝期に来た東晋の僧')")
        db.execSQL("INSERT INTO MyTable7 VALUES('グプタ朝','法顕が来た時のインドの王朝')")
        db.execSQL("INSERT INTO MyTable7 VALUES('仏国記','法顕の著作')")
        db.execSQL("INSERT INTO MyTable7 VALUES('法顕','仏国記の作者')")
        db.execSQL("INSERT INTO MyTable7 VALUES('『シャクンタラー』','カーリダーサ')")
        db.execSQL("INSERT INTO MyTable7 VALUES('カーリダーサ','『シャクンタラー』を著したのは')")
        db.execSQL("INSERT INTO MyTable7 VALUES('グプタ朝期','マハーバーラタやラーマーヤナの成立時期')")
        db.execSQL("INSERT INTO MyTable7 VALUES('ラーマーヤナ','コーサラ国の王子の冒険譚、妻のシータを救出')")
        db.execSQL("INSERT INTO MyTable7 VALUES('マハーバーラタ','一族間の戦争をめぐる大叙事詩')")
        db.execSQL("INSERT INTO MyTable7 VALUES('マヌ法典','ヒンドゥー教の経典、ヴァルナごとの生き方を定めた')")
        db.execSQL("INSERT INTO MyTable7 VALUES('ブラフマー、ヴィシュヌ、シヴァ','ヒンドゥー教の三大神')")
        db.execSQL("INSERT INTO MyTable7 VALUES('サンスクリット文学','グプタ朝は～～～～の黄金期')")
        db.execSQL("INSERT INTO MyTable7 VALUES('グプタ朝','ゼロの概念はいつの王朝？')")
        db.execSQL("INSERT INTO MyTable7 VALUES('グプタ朝','ナーランダー僧院の建設')")
        db.execSQL("INSERT INTO MyTable7 VALUES('アジャンター石窟寺院、エローラ石窟寺院','グプタ朝に建設された石窟寺院二つ')")
        db.execSQL("INSERT INTO MyTable7 VALUES('グプタ朝','アジャンター石窟寺院やエローラ石窟寺院が建てられる')")
        db.execSQL("INSERT INTO MyTable7 VALUES('エフタル','グプタ朝の衰退、西北から異民族の圧迫')")
        db.execSQL("INSERT INTO MyTable7 VALUES('７世紀','ヴァルダナ朝は何世紀？')")
        db.execSQL("INSERT INTO MyTable7 VALUES('ヴァルダナ朝','玄奘が訪れた王朝')")
        db.execSQL("INSERT INTO MyTable7 VALUES('大唐西域記','玄奘の著作')")
        db.execSQL("INSERT INTO MyTable7 VALUES('玄奘','大唐西域記の作者')")
        db.execSQL("INSERT INTO MyTable7 VALUES('ナーランダー僧院','玄奘、義浄が学んだ仏教研究施設')")
        db.execSQL("INSERT INTO MyTable7 VALUES('ハルシャ＝ヴァルダナ','ヴァルダナ朝の創始者')")
        db.execSQL("INSERT INTO MyTable7 VALUES('戒日王','ハルシャ＝ヴァルダナの中国名')")
        db.execSQL("INSERT INTO MyTable7 VALUES('ラージプート時代','ヴァルダナ朝滅亡後インド')")
        db.execSQL("INSERT INTO MyTable7 VALUES('ドラヴィダ系','南インドは〜系')")
        db.execSQL("INSERT INTO MyTable7 VALUES('タミル語','南インドの主要言語')")
        db.execSQL("INSERT INTO MyTable7 VALUES('シンハラ王国','セイロン島に栄えた仏教国、上座部仏教布教の拠点')")
        db.execSQL("INSERT INTO MyTable7 VALUES('バクティ信仰','南インドでおこった最高神への絶対帰依を目指すヒンドゥー教の改革運動')")
        db.execSQL("INSERT INTO MyTable7 VALUES('エリュトゥラー海案内記','ギリシア人によって記された1世紀ごろの季節風貿易の実態がわかる史料')")
        db.execSQL("INSERT INTO MyTable7 VALUES('南海寄帰内法伝','義浄の著作')")
        db.execSQL("INSERT INTO MyTable7 VALUES('義浄','南海寄帰内法伝を著したのは')")
        db.execSQL("INSERT INTO MyTable7 VALUES('シュリーヴィジャヤ王国','義浄が立ち寄ったスマトラの王国')")
        db.execSQL("INSERT INTO MyTable7 VALUES('チョーラ朝','スリランカやシュリーヴィジャヤに遠征した南インドのドラヴィダ王朝、９世紀〜１１世紀強勢')")
        db.execSQL("INSERT INTO MyTable7 VALUES('パーンディヤ朝','インド南端のドラヴィダ系王朝、エリュトゥラー海案内記に登場')")

        db.execSQL("INSERT INTO MyTable8 VALUES('河姆渡遺跡','ＢＣ５０００～長江流域の遺跡')")
        db.execSQL("INSERT INTO MyTable8 VALUES('長江','河姆渡遺跡は○○下流域')")
        db.execSQL("INSERT INTO MyTable8 VALUES('河姆渡遺跡','稲籾が出土、ＢＣ５０００')")
        db.execSQL("INSERT INTO MyTable8 VALUES('仰韶','ＢＣ５０００～３０００黄河中流、彩陶')")
        db.execSQL("INSERT INTO MyTable8 VALUES('竜山文化','ＢＣ３０００～２０００、黄河下流、黒陶、灰陶')")
        db.execSQL("INSERT INTO MyTable8 VALUES('夏','中国最古の伝説的王朝')")
        db.execSQL("INSERT INTO MyTable8 VALUES('殷墟','殷の首都の遺跡')")
        db.execSQL("INSERT INTO MyTable8 VALUES('殷','ＢＣ１６００ごろ湯王が夏の暴君桀を倒して建てる')")
        db.execSQL("INSERT INTO MyTable8 VALUES('邑','殷は都市国家の集合体、都市国家のことを？')")
        db.execSQL("INSERT INTO MyTable8 VALUES('大邑商','殷の首都')")
        db.execSQL("INSERT INTO MyTable8 VALUES('殷','甲骨文字を使用、神権政治、いつの王朝')")
        db.execSQL("INSERT INTO MyTable8 VALUES('殷','邑制国家、いつの王朝')")
        db.execSQL("INSERT INTO MyTable8 VALUES('青銅器','殷は○○器文明')")
        db.execSQL("INSERT INTO MyTable8 VALUES('周','封建制といえば')")
        db.execSQL("INSERT INTO MyTable8 VALUES('鎬京','周の都')")
        db.execSQL("INSERT INTO MyTable8 VALUES('宗族','古代中国における血縁集団')")
        db.execSQL("INSERT INTO MyTable8 VALUES('宗法','血縁集団内部の規則、規範、礼制')")
        db.execSQL("INSERT INTO MyTable8 VALUES('血縁','中国の封建制は、○○重視')")
        db.execSQL("INSERT INTO MyTable8 VALUES('犬戎','ＢＣ７７０侵入した異民族')")
        db.execSQL("INSERT INTO MyTable8 VALUES('洛邑','周の東遷、首都をどこに遷す？')")
        db.execSQL("INSERT INTO MyTable8 VALUES('弱くなる','周の東遷、以後、周王の権力は？')")
        db.execSQL("INSERT INTO MyTable8 VALUES('山東省','春秋五覇、戦国七雄、斉はどこ？')")
        db.execSQL("INSERT INTO MyTable8 VALUES('春秋','諸侯を召集して会盟を主催しようとしたのは春秋？戦国？')")
        db.execSQL("INSERT INTO MyTable8 VALUES('春秋','周王尊び、異民族を討伐する、春秋？戦国？')")
        db.execSQL("INSERT INTO MyTable8 VALUES('晋','春秋から戦国は、ＢＣ４０３　○の分裂')")
        db.execSQL("INSERT INTO MyTable8 VALUES('斉楚秦燕韓魏趙','戦国七雄')")
        db.execSQL("INSERT INTO MyTable8 VALUES('下克上','戦国時代の風潮')")
        db.execSQL("INSERT INTO MyTable8 VALUES('楚','戦国七雄、長江下流域')")
        db.execSQL("INSERT INTO MyTable8 VALUES('秦','戦国七雄、渭水盆地')")
        db.execSQL("INSERT INTO MyTable8 VALUES('秦','戦国七雄、陝西地方')")
        db.execSQL("INSERT INTO MyTable8 VALUES('蘇秦','合従策')")
        db.execSQL("INSERT INTO MyTable8 VALUES('張儀','連衡策')")
        db.execSQL("INSERT INTO MyTable8 VALUES('孫子','兵家')")
        db.execSQL("INSERT INTO MyTable8 VALUES('鄒衍','陰陽五行家')")
        db.execSQL("INSERT INTO MyTable8 VALUES('公孫竜','名家')")
        db.execSQL("INSERT INTO MyTable8 VALUES('法家','韓非子')")
        db.execSQL("INSERT INTO MyTable8 VALUES('易経、書経、詩経、礼記、春秋','五経')")
        db.execSQL("INSERT INTO MyTable8 VALUES('詩経','春秋戦国、華北の詩を集めたもの')")
        db.execSQL("INSERT INTO MyTable8 VALUES('楚辞','春秋戦国、華南の詩を集めたもの')")
        db.execSQL("INSERT INTO MyTable8 VALUES('屈原','楚辞の作者')")
        db.execSQL("INSERT INTO MyTable8 VALUES('老子','無為自然、小国寡民')")
        db.execSQL("INSERT INTO MyTable8 VALUES('道教に','老荘思想はのち民間信仰と結びついて、…')")
        db.execSQL("INSERT INTO MyTable8 VALUES('墨子','非攻、兼愛')")

    }

    override fun onUpgrade(db: SQLiteDatabase, oldVersion: Int, newVersion: Int) {

        db.execSQL("DROP TABLE IF EXISTS MyTable1")
        db.execSQL("DROP TABLE IF EXISTS MyTable2")
        db.execSQL("DROP TABLE IF EXISTS MyTable3")
        db.execSQL("DROP TABLE IF EXISTS MyTable4")
        db.execSQL("DROP TABLE IF EXISTS MyTable5")
        db.execSQL("DROP TABLE IF EXISTS MyTable6")
        db.execSQL("DROP TABLE IF EXISTS MyTable7")
        db.execSQL("DROP TABLE IF EXISTS MyTable8")

        onCreate(db)

    }

    override fun onDowngrade(db: SQLiteDatabase, oldVersion: Int, newVersion: Int) {

        onUpgrade(db, oldVersion, newVersion)

    }
}