# RecyclerViewSample

RecyclerView を使った Todo アプリのサンプル

## 環境

- targetSdk: 28
- language: Kotlin
- library:
  - recyclerview-v7:28.0.0
  - cardview-v7:28.0.0

## 実装手順

[commits](https://github.com/konatsup/RecyclerViewSample/commits/master) を確認

1. recyclerview と cardview を build.gradle に追加
2. (動かなければ sdk version を 28 にする)
3. list_item.xml を作成
4. Task のモデル作成
5. TaskViewAdapter の作成
6. activity_main.xml に RecyclerView を追加する
7. テストデータを 10 件作成し、taskRecyclerView に反映しリスト表示する
