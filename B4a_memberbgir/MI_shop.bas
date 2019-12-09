B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=7.3
@EndOfDesignText@
	Sub Class_Globals
	Private Ev As String
	Private obj As Object
	Dim sql1 As SQL
	Dim cursor1 As Cursor
	Dim pnl_insta As Panel
	Dim LV As Hitex_LayoutView
	Dim Glide As Hitex_Glide
	Dim prfn As PersianFastNetwork
	Dim i_username ,i_pk,i_cookie,i_pic As String
	Dim l_insta(40) As List
	Private xml As XmlLayoutBuilder
	''''''''''''''''''''''''''
	Private img1,img2 As ImageView
	Private lbluser As Label
	Private typefc=Typeface.LoadFromAssets("iran_sans.ttf") As Typeface
	Private pln1,pnl2 As Panel
	Private imgf,imgm As ImageView
	Private lblf,lblm,lblnf,lblnm As Label
	Private btnf,btnm As ACButton
	Private lbtf,lbtm As Label
	Private pnldv1,pnldv2 As Panel
    Private pnl_ulv As Panel
	Private LV As Hitex_LayoutView
	Private Glide As Hitex_Glide
	
	Private pay1,pay2 As Int
	Private ty=0 As Int
	Private cm,cf As String
	Private mNivadBilling As BillingProcessor
	Private numc As Int
	Dim type_history As Int
	Private username_t ,userid_t As String
	
End Sub

'Initializes the object. You can add parameters to this method if needed.
Public Sub Initialize(EventName As String,Module As Object)
	Ev = EventName
	obj = Module

	
	For ia=0 To 38
		
		l_insta(ia).Initialize
	
		
	Next
	
	'''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''database
	If File.Exists(File.DirInternal,"instadb.db")=False Then
		File.Copy(File.DirAssets,"instadb.db",File.DirInternal,"instadb.db")
	End If
	If sql1.IsInitialized=False Then
		sql1.Initialize(File.DirInternal,"instadb.db",False)
	
	End If
	
	cursor1 = sql1.ExecQuery("SELECT * FROM tbl_acc WHERE soich='1' ")
	Dim i As Int
	For i=0 To cursor1.RowCount-1
		cursor1.Position=i
		i_cookie=cursor1.GetString("cookie")
		i_username=cursor1.GetString("username")
		i_pk=cursor1.GetString("pk")
		i_pic=cursor1.GetString("profile_pic_url")
	Next
	Log(i_pic)
    
	cursor1 = sql1.ExecQuery("SELECT * FROM tbl_tele WHERE soich='1'")
	Dim i As Int
	For i=0 To cursor1.RowCount-1
		cursor1.Position=i
		userid_t=cursor1.GetString("userid")
		username_t=cursor1.GetString("username")
	Next
	cursor1.Close
	
	pay1=50
	pay2=1000
	
	cursor1 = sql1.ExecQuery("SELECT * FROM tbl_coin WHERE userid='"&i_pk&"' ")
	Dim i As Int
	For i=0 To cursor1.RowCount-1
		cursor1.Position=i
		cm=cursor1.GetString("cm")
		cf=cursor1.GetString("cf")
	Next
	
	Dim bazaarRSAKey As String
	Dim nivadApplicationID As String
	Dim nivadBillingSecret As String
		
	bazaarRSAKey = "MIHNMA0GCSqGSIb3DQEBAQUAA4G7ADCBtwKBrwDpILXW5YROn8aS7zjkX20eTq841CSXg/6+rHGljI8i2LOZ6j+lB7J1ePVHqhvd9tgfnHTjdMNma2fgvAtxMwDuJM3x96mHLS/ryQTNLZoBpN6pjpPa72UjUyXKH1dfSeXuJjhNtXGH6CXrAVG4v6iS8nbzyxJKAqTLyNs0KcDa6Lx/oYDdJaA9GDwgjLMSmwJSyLA76nMJRsxsZmnmwpDp+ehQwCSSKXEYf40GrDECAwEAAQ=="
	nivadApplicationID = "4a220906-839f-477a-9740-ab9287f96909"
	nivadBillingSecret = "sdL43cUCx9JYKS3p9HLCbT9Hmd4TaN7CMnV4QrAscf5JUf4YD2kIKwJz6wgNrAbk"
		
	mNivadBilling.initialize(bazaarRSAKey, nivadApplicationID, nivadBillingSecret)

	
End Sub


Sub addpnl(pnl As Panel) As View
	
'	pnl.Color=0xFF673AB7
    
	''''''''''''''''''''''''''''''''''''''''''''''''''''''
	pnl_ulv.Initialize("")
	pnl.AddView(pnl_ulv,0,0,pnl.Width,pnl.Height)
	
	LV.Initializer("LV").ListView.Build
	pnl_ulv.AddView(LV,2%x,0,pnl_ulv.Width-4%x,pnl_ulv.Height)
	LV.CardView.CardElevation(4dip).Radius(2dip)
	LV.Divider.Add1(Colors.Transparent,5%x)
	LV.Show
	
	req_getme("")
'	Dim insta As insta
'	insta.Initialize(1,"insta",Me,"")
'	insta.user_follow("2894270461",i_pk,i_cookie)
	
End Sub

Sub insta_user_FollowDone(response As String,job As Boolean)
	Log(job)
End Sub


Sub LV_onCreateViewHolder (Parent As Panel, ViewType As Int)      '# onCreate #'
	
	Dim pnl_main As Panel
	pnl_main.Initialize("pnl_main")
	pnl_main.Color=Colors.White
	Parent.AddView(pnl_main,0,0,Parent.Width,Parent.Height)
	
	Dim lbl As Label : lbl.Initialize("lbl")
	lbl.TextColor = Colors.DarkGray : lbl.TextSize = 12
	lbl.Typeface=typefc
	lbl.Gravity=Gravity.CENTER_HORIZONTAL+Gravity.CENTER_VERTICAL
	lbl.Typeface=Typeface.LoadFromAssets("iran_sans.ttf")
	pnl_main.AddView(lbl,22%x,0,pnl_main.Width-22%x,pnl_main.Height)
	
	Dim btn_pay As ACButton : btn_pay.Initialize("btn_pay")
	btn_pay.TextColor = Colors.White : btn_pay.TextSize = 17
	btn_pay.Typeface=typefc
	btn_pay.Color=0xFF1C5C41
	btn_pay.Text="خرید"
	btn_pay.Typeface=Typeface.LoadFromAssets("iran_sans.ttf")
	btn_pay.Gravity=Gravity.CENTER_HORIZONTAL+Gravity.CENTER_VERTICAL
	pnl_main.AddView(btn_pay,0,0,20%x,pnl_main.Height)
	
	pnl_main.Height=18%x
	Parent.Height=18%x
	Parent.Color=Colors.Transparent
End Sub

Sub LV_onBindViewHolder (Parent As Panel, Position As Int)         '* onBind *'
	Dim pnl_main = Parent.GetView(0) As Panel
	Dim lbl = pnl_main.GetView(0) As Label
	Dim btn_pay = pnl_main.GetView(1) As ACButton
	
	btn_pay.Tag=Position


	lbl.Text = "خرید "&l_insta(8).Get(Position)&" سکه "&NumberFormat(l_insta(6).Get(Position), 3 ,0)&" تومان "

	
End Sub

Sub LV_GetItemCount As Int 								        '$ ItemCount $'
	Select ty
		
		Case 1
			Return l_insta(1).Size
		Case 2	
			Return l_insta(5).Size
		
	End Select
End Sub

Sub req_getme(userid As String)
	prfn.initialize("prfn").WithSSL.WithCookieManager.Build
	Dim post As PostRequest
	post=prfn.WithCookieManager.WithSSL.BuildPostQuery("http://filework.ir/INSTAFOLLOW/api/pay_list.php","getinsta")
	
	post.addHeder("User-Agent","Dalvik/1.6.0 (Linux; U; Android 4.4.4; SM-A700FD Build/KTU84P)")
	post.executRequestAsString

'	post.addParametrs("ui","1")
'	post.addParametrs("userid","123456")
'
'	post.addParametrs("req","get_acci")
	
'	prfn.initialize("prfn").WithSSL.Build
'	prfn.BuildGetQuery("https://p30-learn.com/Services/api/pay_list.php","getinsta").executRequesAsString

End Sub

Sub prfn_onPostStringErrorListener(Error As ResponseError , Tag As String)
	Log(Error.ErrorBody)
	Log(Error.CauseMessage)
	Log(Error.ErrorDetails)
	Log(Error.ErrorLocalizedMsage)
	Log(Error.ErrorMsage)
	Log(Error.ResponseBody)
	
	ProgressDialogHide
	
End Sub

Sub prfn_onPostStringOkListener(Result As String  , Tag As String)
	LogColor(Result,Colors.Red)
	ProgressDialogHide
	Select Tag
		
		Case "getinsta":
			Log(Result)
			
			Dim parser As JSONParser
			parser.Initialize(Result)
			
			Dim root As List = parser.NextArray
			For Each colroot As Map In root
				Dim t_old As String = colroot.Get("t_old")
				Dim price As String = colroot.Get("price")
				Dim name As String = colroot.Get("name")
				Dim x As String = colroot.Get("x")
				Dim t_new As String = colroot.Get("t_new")
				Dim id As String = colroot.Get("id")
				
				Select x
					Case "follow":
						l_insta(1).Add(t_old)
						l_insta(2).Add(price)
						l_insta(3).Add(name)
						l_insta(4).Add(t_new)
						
					Case "like":
						l_insta(5).Add(t_old)
						l_insta(6).Add(price)
						l_insta(7).Add(name)
						l_insta(8).Add(t_new)
						
						
				End Select
				
				
				
			Next
			btnm_Click
		Case "sefss":
			If Result.Contains("error_code")=True Then
				ToastMessageShow("ثبت خرید ناموفق بود :)",False)
			Else
				Dim parser As JSONParser
				parser.Initialize(Result)
				Dim root As List = parser.NextArray
				For Each colroot As Map In root
				Log(Result)
				Dim Result As String = colroot.Get("result")
				Dim c_m As String = colroot.Get("c_m")
				Dim uid As String = colroot.Get("uid")
				Dim id As String = colroot.Get("id")
				Dim c_f As String = colroot.Get("c_f")
				Dim pic As String = colroot.Get("pic")
				Dim userid As String = colroot.Get("userid")
				Dim username As String = colroot.Get("username")
				Log(c_f)
				Log(c_m)
'					lblnf.Text=c_f
'					lblnm.Text=c_m
					CallSubDelayed2(obj,Ev&"_"&"newcointele",c_m)

				sql1.ExecNonQuery("UPDATE tbl_coin set cm='"&c_m&"',cf='"&c_f&"' WHERE userid='"&i_pk&"' ")
			    Next
			End If
			
		Case "seftele":
			Dim parser As JSONParser
			parser.Initialize(Result)
			Dim root As List = parser.NextArray
			For Each colroot As Map In root
				Dim Result As String = colroot.Get("result")
				Dim c_m As String = colroot.Get("c_m")
				Dim uid As String = colroot.Get("uid")
				Dim first_last As String = colroot.Get("first_last")
				Dim id As String = colroot.Get("id")
				Dim userid As String = colroot.Get("userid")
				Dim username As String = colroot.Get("username")
				Dim c_ch As String = colroot.Get("c_ch")

				Log("cc : "&c_m)
				Dim n_coins=c_m As Long
				CallSubDelayed2(obj,Ev&"_"&"newcointele",c_m)
'				If n_coins>100 Then
'					lbl_nums.Text="سکه "&NumberFormat(c_m,3,0)
'				Else
'					lbl_nums.Text="سکه "&c_m
'				End If
'				lbl_fcoin.Text=NumberFormat(c_f,3,0)
				
				sql1.ExecNonQuery("UPDATE tbl_coin set cm='"&c_m&"',cf='"&c_ch&"' WHERE userid='"&userid_t&"' ")
			Next
			
	End Select
End Sub

Sub btnf_Click
'	btnf.TextColor=Colors.White
'	lbtf.TextColor=Colors.White
'	
'	btnm.TextColor=Colors.LightGray
'	lbtm.TextColor=Colors.LightGray
	
	If l_insta(1).Size=0 Then
		
		ToastMessageShow("در حال حاضر لیستی جهت خرید موجود نمیباشد",False)
		Return True
	End If
	
    ty=1
	LV.notifyDataSetChanged
End Sub

Sub btnm_Click
'	btnf.TextColor=Colors.LightGray
'	lbtf.TextColor=Colors.LightGray
'	
'	btnm.TextColor=Colors.White
'	lbtm.TextColor=Colors.White
	If l_insta(4).Size=0 Then
		
		ToastMessageShow("در حال حاضر لیستی جهت خرید موجود نمیباشد",False)
		Return True
	End If
	
    ty=2
	LV.notifyDataSetChanged
End Sub


Sub btn_pay_Click
	Dim b As ACButton
	b=Sender
'	mNivadBilling.purchase(l_insta(3).Get(b.Tag),Null)
'	numc=l_insta(2).Get(b.Tag)
	Select type_history
   	
		Case 0:
			numc=l_insta(8).Get(b.Tag)
			mNivadBilling.purchase(l_insta(7).Get(b.Tag),Null)
		
			
		
		Case 1:
			numc=l_insta(8).Get(b.Tag)
			mNivadBilling.purchase(l_insta(7).Get(b.Tag),Null)
			
	
	
	End Select
End Sub


Sub nivadbilling_product_purchased(sku As String, details As TransactionDetails)
	Log("Purchased" & sku)
	ToastMessageShow( "خرید با موفقیت انجام شد!",False)
	mNivadBilling.consumePurchase("gold_version")
	mNivadBilling.consumePurchase(sku)
   Select type_history
   	
	Case 0:
			reqsef(i_pk,"1",numc)
		
		Case 1:
			reqsef_tele(userid_t,"1",numc)
			
	
	
	End Select
End Sub



Sub reqsef(userid As String,types As String,target As String)
'	Dim fm As FirebaseMessaging
'	fm.Initialize("fm")
	prfn.initialize("prfn")
	Dim post As PostRequest
	post=prfn.BuildPostQuery("http://filework.ir/INSTAFOLLOW/api/req.php","sefss")
	
	post.addHeder("User-Agent","Dalvik/1.6.0 (Linux; U; Android 4.4.4; SM-A700FD Build/KTU84P)")
	post.addParametrs("req","coin_pay")
'	Log(fm.Token)
	post.addParametrs("uid","1")
	post.addParametrs("types",types)
	post.addParametrs("userid",userid)
	post.addParametrs("target",target)


'	post.addJSONParametrs(coo)
	post.executRequestAsString
	
	ProgressDialogShow("در حال پردازش...")
	
	
End Sub

Sub reqsef_tele(userid As String,types As String,target As String)
'	Dim fm As FirebaseMessaging
'	fm.Initialize("fm")
	prfn.initialize("prfn")
	Dim post As PostRequest
	post=prfn.BuildPostQuery("http://filework.ir/INSTAFOLLOW/api/req.php","seftele")
	
	post.addHeder("User-Agent","Dalvik/1.6.0 (Linux; U; Android 4.4.4; SM-A700FD Build/KTU84P)")
	post.addParametrs("req","coin_paytele")
'	Log(fm.Token)
	post.addParametrs("uid","1")
	post.addParametrs("types",types)
	post.addParametrs("userid",userid)
	post.addParametrs("target",target)


'	post.addJSONParametrs(coo)
	post.executRequestAsString
	
	ProgressDialogShow("در حال پردازش...")
	
	
End Sub


			