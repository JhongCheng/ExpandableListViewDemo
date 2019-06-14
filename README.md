
# ExpandableListViewDemo

## 本文轉自:
> [菜鳥教程--2.5.5 ExpandableListView（可折疊列表）的基本使用僅學習用 - 原作者有Demo檔可下載](http://www.runoob.com/w3cnote/android-tutorial-expandablelistview.html)
## 圖片出自:
> [BATTLEGROUNDS_Wiki](https://pubg.gamepedia.com/PLAYERUNKNOWNS_BATTLEGROUNDS_Wiki)

## 實現`ExpandableAdapter`的三種方式:
*    擴展BaseExpandableListAdpter實現ExpandableAdapter。
*    使用SimpleExpandableListAdpater將兩個List集合包裝成ExpandableAdapter。
*   使用SimpleCursorTreeAdapter將Cursor中的數據包裝成SimpleCuroTreeAdapter。

## 相關屬性:
*    android:childDivider :指定各組內子列表之間的分隔線,圖片不會完全顯示,分離子列表象的是一條直線。
*    adroid:childlnicator :顯示子列表旁邊的Drawable對象,可以是一個圖像。
*    adroid:childlndicatorEnd :子列表項指示符的結束約束位置。
*    android:childlndicatorLeft :子列表項指示符的左邊約束位置。
*    android:childIndicatorRight :子列表指示符的右邊約束位置。
*    android:childIndicatorStart :子列表指示符的開始約束位置。
*    android:groupIndicator :顯示在組列表旁邊的Drawable對象,可以是一個圖像。
*    android:indicatorEnd :組列表項指示器的結束約束位置。
*    android:indicatorLeft :組列表項指示器的左邊約束位置。
*    android:indicatorRight :組列表項指示器的右邊約束位置。
*    android:indicatorStart :組列表項指示器的開始約束位置。
