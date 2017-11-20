# ExpandTextView
仿微信的展开全部和折起，设置最大行数，后超过部分显示省略号，如果不超过最大行数，则隐藏展开和折叠按钮。同时满足ListView等列表的滑动复用问题。

#### 源码地址：https://github.com/Manabu-GT/ExpandableTextView


这个ExpandTextView是在ExpandableTextView的基础上添加了一些功能，适用于自己的项目中。非常感谢ExpandableTextView的作者，解决了自己问题的同时，也学习了很多的知识。

在原有的基础上写了一个适用于ListView中的例子，同时也避免了滑动过程中item复用导致的问题。
 
 
    其中修改的部分主要有以下几点：
    1、开放设置动画功能 
    在原来的库中，动画效果是默认的，无法进行动态的关闭，当然动画也是比较消耗资源，因此在ListView和RecycleView等这样的列表展示的页面中，比较占用资源，因此根据需要可以自己选择是否开启动画效果。
    2、展开按钮布局变化
    在原来的库中，由于展开按钮使用的是ImageButton，无法展示文字效果，而在我们的项目中要求显示展开全部和折起文案，因此手动改动，将默认文案展示也开放出来。


    <com.example.library.ExpandableTextView
        android:id="@+id/expand_text_view"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        expandableTextView:animDuration="200"
        expandableTextView:collapseDrawable="@mipmap/ic_expand_less_black_12dp"
        expandableTextView:expandDrawable="@mipmap/ic_expand_more_black_12dp"
        expandableTextView:expandText="展开全部"
        expandableTextView:collapseText="收起"
        expandableTextView:haveAnim="false"
        android:layout_marginBottom="10dp"
        expandableTextView:maxCollapsedLines="2">

        <TextView
            android:id="@id/expandable_text"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:layout_marginLeft="15dp"
            android:layout_marginRight="15dp"
            android:textColor="#666666"
            android:textSize="16sp" />

        <LinearLayout
            android:id="@id/expandable_box"
            android:layout_width="match_parent"
            android:layout_height="38dp"
            android:orientation="vertical">

            <TextView
                android:id="@id/expand_collapse"
                android:layout_width="wrap_content"
                android:layout_height="38dp"
                android:layout_gravity="center"
                android:drawablePadding="5dp"
                android:gravity="center"
                android:textColor="#438fea"
                android:textSize="17sp" />

        </LinearLayout>

    </com.example.library.ExpandableTextView>
    
    
    这里主要介绍一下各个属性的作用和使用注意的地方：
    
    animDuration：动画时间
    
    collapseDrawable：收起的图标
    
    expandDrawable：展开图标
    
    expandText：默认展开文案
    
    collapseText：默认收起文案
    
    haveAnim：是否启用动画
    
    maxCollapsedLines：最大显示行数，超过部分显示省略号
    
    注意：
    子布局中的id要和ids.xml文件下的对应上
    
    还是建议在使用时将代码复制到自己的项目中，然后根据需要自己对代码进行修改
    
