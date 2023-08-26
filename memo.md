# Javaとは
- JavaはSun Microsystems社(現Oracle)が1995年に発表したプログラミング言語の一つ
- プログラムとは、コンピュータにさせたい処理の順番を書き記したもの。ソースプログラム、ソースとも言う

# プログラムが動くまで
- ソースプログラム → コンパイラ → 実行可能ファイルに変換 → 出力！！

# Javaの特徴
- オブジェクト指向　→ 大規模な開発で使用できる
- プロットフォーム非依存 → どこでも動く
    - JVM(JavaVirtualMachine)
        - Javaのプログラムを動かすためのソフトウェア。Java仮想マシンとも呼ぶ
    - JDK(JavaDevelopmentKit)
        - Javaの開発環境。Oracle社のサイトからダウンロードできる。


# Javaの開発環境
## Javaを動かすための準備
- ①JDKのインストール
    - JDK(JavaDevelopmentKit): Javaの開発環境
    - AdoptOpenJDK(バージョン11/HotSpot)を利用
- ②環境変数の設定
    - PATH: Javaの実行ファイルはどこ？→ JDK内のbinフォルダの場所を指定
    - JAVA_HOME: Javaはどこ？ → JDKのフォルダの場所を指定
- ③コマンドプランプトで設定確認