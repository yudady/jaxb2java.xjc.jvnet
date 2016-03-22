<?xml version='1.0'?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform" xmlns:common="http://www.example.org/common" xmlns:response="http://www.example.org/response">
<xsl:template match="/response:Response">
<xsl:variable name="response_status">
  <xsl:if test="response:Status='-1'">
    <xsl:value-of select="'退件'" /></xsl:if>
  <xsl:if test="response:Status='1'">
    <xsl:value-of select="'成功'" /></xsl:if>
</xsl:variable>
<HTML>
  <HEAD>
    <TITLE>ISP回覆檔XML</TITLE>
  </HEAD>
  <BODY link="#006363" vLink="#006363">
    <BASEFONT face="Arial" size="2">
      <h2>回覆資訊摘要</h2>
      
        <table border="1">
          <tr>
            <td>回覆結果</td>
            <td><xsl:value-of select="$response_status"/></td>
          </tr>
          <tr>
            <td>回覆時間</td>
            <td><xsl:value-of select="response:ResDT"/></td>
          </tr>
          <tr>
            <td>發文案號</td>
            <td><xsl:value-of select="response:DocNo"/></td>
          </tr>
          <tr>
            <td>備註, 說明該查詢單失敗原因 (如:批核不准原因)</td>
            <td><xsl:value-of select="response:Comment"/></td>
          </tr>
        </table>

      <h2>每筆查詢紀錄</h2>
    <xsl:for-each select="response:Record">
	
	  <xsl:variable name="vendor_type" select="common:VendorType" />
	  <xsl:variable name="object_type">
	    <xsl:choose>
	      <xsl:when test="common:ObjectType='30'">
		    <xsl:value-of select="'IP Address'" /></xsl:when>
		  <xsl:when test="common:ObjectType='40'">
		    <xsl:value-of select="'線路編號'" /></xsl:when>
		  <xsl:when test="common:ObjectType='50'">
		    <xsl:value-of select="MAC" /></xsl:when>
		  <xsl:when test="common:ObjectType='60'">
		    <xsl:value-of select="'RADIUS帳號'" /></xsl:when>
		  <xsl:when test="common:ObjectType='70'">
		    <xsl:value-of select="'MSISDN'" /></xsl:when>
		  <xsl:when test="common:ObjectType='80'">
		    <xsl:value-of select="'BSID'" /></xsl:when>
		  <xsl:otherwise>
	        <xsl:value-of select="'尚未定義'" /></xsl:otherwise>
	    </xsl:choose>
	  </xsl:variable>

        <h4>調閱序號：<xsl:value-of select="@Seq"/></h4>
		
        <table border="1">
		  <tr>
            <td>業務類別</td>
            <td><xsl:value-of select="common:VendorType"/></td>
          </tr>
		  <tr>
            <td>業者名稱</td>
            <td><xsl:value-of select="common:VendorName"/></td>
          </tr>
          <tr>
            <td>目標類別</td>
			<td><xsl:value-of select="$object_type"/></td>
          </tr>
          <tr>
            <td>目標</td>
            <td><xsl:value-of select="common:Object"/></td>
          </tr>
          <tr>
            <td>查詢目標啟始時間</td>
            <td><xsl:value-of select="common:StartDT"/></td>
          </tr>
          <tr>
            <td>查詢目標結束時間</td>
            <td><xsl:value-of select="common:EndDT"/></td>
          </tr>
        </table>

	  <xsl:for-each select="response:Result">
	    <xsl:variable name="customer_count" select="position()" />
	    
 		<xsl:for-each select="response:CustomerInfo">

		<h5>客戶資訊 <xsl:value-of select="$customer_count" /></h5>
		    <xsl:variable name="id_type">
		      <xsl:choose>
		        <xsl:when test="response:IDType='0'"><xsl:value-of select="'unknown'" /></xsl:when>
  		        <xsl:when test="response:IDType='1'"><xsl:value-of select="'身份證字號'" /></xsl:when>
		        <xsl:when test="response:IDType='2'"><xsl:value-of select="'公司統一編號'" /></xsl:when>
		        <xsl:when test="response:IDType='3'"><xsl:value-of select="'居留證號碼'" /></xsl:when>
		        <xsl:when test="response:IDType='4'"><xsl:value-of select="'護照號碼'" /></xsl:when>
		        <xsl:when test="response:IDType='5'"><xsl:value-of select="'稅籍編號'" /></xsl:when>
		        <xsl:otherwise><xsl:value-of select="'unknown'" /></xsl:otherwise>
		      </xsl:choose>
	        </xsl:variable>
	        <xsl:variable name="second_id_type">
		      <xsl:choose>
		        <xsl:when test="response:SecondIDType='0'"><xsl:value-of select="'unknown'" /></xsl:when>
  		        <xsl:when test="response:SecondIDType='1'"><xsl:value-of select="'身份證字號'" /></xsl:when>
		        <xsl:when test="response:SecondIDType='2'"><xsl:value-of select="'公司統一編號'" /></xsl:when>
		        <xsl:when test="response:SecondIDType='3'"><xsl:value-of select="'居留證號碼'" /></xsl:when>
		        <xsl:when test="response:SecondIDType='4'"><xsl:value-of select="'護照號碼'" /></xsl:when>
		        <xsl:when test="response:SecondIDType='5'"><xsl:value-of select="'稅籍編號'" /></xsl:when>
		        <xsl:otherwise><xsl:value-of select="'unknown'" /></xsl:otherwise>
		      </xsl:choose>
	        </xsl:variable>
			<xsl:variable name="gender">
			  <xsl:if test="response:Gender='0'"><xsl:value-of select="'未知'" /></xsl:if>
			  <xsl:if test="response:Gender='1'"><xsl:value-of select="'男性'" /></xsl:if>
			  <xsl:if test="response:Gender='2'"><xsl:value-of select="'女性'" /></xsl:if>
			</xsl:variable>

            <table border="1">
              <tr>
                <td>用戶證號/號碼</td>
                <td><xsl:value-of select="response:UID"/></td>
              </tr>
			  <tr>
                <td>用戶名稱</td>
                <td><xsl:value-of select="response:Name"/></td>
              </tr>
              <tr>
                <td>帳寄地址</td>
                <td><xsl:value-of select="response:BillingAddress"/></td>
              </tr>
              <tr>
                <td>戶籍地址</td>
                <td><xsl:value-of select="response:CustomerAddress"/></td>
              </tr>
			  <tr>
                <td>證號類別</td>
                <td><xsl:value-of select="$id_type"/></td>
              </tr>
              <tr>
                <td>證號</td>
                <td><xsl:value-of select="response:ID"/></td>
              </tr>
              <tr>
                <td>第二證號類別</td>
                <td><xsl:value-of select="$second_id_type"/></td>
              </tr>
              <tr>
                <td>第二證號</td>
                <td><xsl:value-of select="response:SecondID"/></td>
              </tr>
			  <tr>
                <td>電子郵件</td>
                <td><xsl:value-of select="response:Email"/></td>
              </tr>
			  <tr>
                <td>性別</td>
                <td><xsl:value-of select="$gender"/></td>
              </tr>
              <tr>
                <td>出生日期</td>
                <td><xsl:value-of select="response:Birthday"/></td>
              </tr>
              <tr>
                <td>申請日期</td>
                <td><xsl:value-of select="response:ReqDate"/></td>
              </tr>
			  <tr>
                <td>業務生效開始時間</td>
                <td><xsl:value-of select="response:StartDT"/></td>
              </tr>
              <tr>
                <td>業務退租停權時間</td>
                <td><xsl:value-of select="response:EndDT"/></td>
              </tr>
              <tr>
                <td>備註</td>
                <td><xsl:value-of select="response:Note"/></td>
              </tr>
			  
			<xsl:if test="$vendor_type='固網' " >
			  <xsl:variable name="service_type">
			    <xsl:choose>
				  <xsl:when test="response:VendorSpecific/response:ServiceType='0'"><xsl:value-of select="'未知'" /></xsl:when>
				  <xsl:when test="response:VendorSpecific/response:ServiceType='1'"><xsl:value-of select="'固定制'" /></xsl:when>
				  <xsl:when test="response:VendorSpecific/response:ServiceType='2'"><xsl:value-of select="'浮動制'" /></xsl:when>
				  <xsl:otherwise><xsl:value-of select="'未知'" /></xsl:otherwise>
				</xsl:choose>
			  </xsl:variable>
			  <tr>
                <td>申裝地址</td>
                <td><xsl:value-of select="response:VendorSpecific/response:InstallAddress"/></td>
              </tr>
			  <tr>
                <td>專線號碼</td>
                <td><xsl:value-of select="response:VendorSpecific/response:DedicatedLine"/></td>
              </tr>
			  <tr>
                <td>附掛電話</td>
                <td><xsl:value-of select="response:VendorSpecific/response:AttachNumber"/></td>
              </tr>
			  <tr>
                <td>服務類別</td>
                <td><xsl:value-of select="$service_type"/></td>
              </tr>
			  <tr>
                <td>LAN-IP</td>
                <td><xsl:value-of select="response:VendorSpecific/response:LANIP"/></td>
              </tr>
              <tr>
                <td>WAN-IP</td>
                <td><xsl:value-of select="response:VendorSpecific/response:WANIP"/></td>
              </tr>
			  <tr>
                <td>帳戶聯絡人</td>
                <td><xsl:value-of select="response:VendorSpecific/response:Contact"/></td>
              </tr>
              <tr>
                <td>聯絡電話</td>
                <td><xsl:value-of select="response:VendorSpecific/response:Phone"/></td>
              </tr>
			</xsl:if>
			
			<xsl:if test="$vendor_type='3G' or $vendor_type='WiFi' or $vendor_type='行網'" >
			  <tr>
                <td>申請號碼</td>
                <td><xsl:value-of select="response:VendorSpecific/response:MSISDN"/></td>
              </tr>
			  <tr>
                <td>門號類型</td>
                <td><xsl:value-of select="response:VendorSpecific/response:Category"/></td>
              </tr>
			  <tr>
                <td>聯絡電話</td>
                <td><xsl:value-of select="response:VendorSpecific/response:Phone"/></td>
              </tr>
			  <tr>
                <td>聯絡電話屬性</td>
                <td><xsl:value-of select="response:VendorSpecific/response:Usage"/></td>
              </tr>
			</xsl:if>

            </table>
			
			<br/>
        </xsl:for-each>

		<xsl:variable name="wifi_info" select="response:WiFiInfo" />
		<xsl:variable name="cell_info" select="response:CellInfo" />
		
		<xsl:if test="$vendor_type='3G' or $vendor_type='4G' or $vendor_type='WiFi' or $vendor_type='行網' " >
		<h5>通聯資訊</h5>
			<xsl:if test="$cell_info != ''">
			<table border="1">
			  <tr align="center">
	            <td>進入時間</td>
	            <td>滯留時間(秒)</td>
	            <td>離開時間</td>
	            <td>起始Cell Global Identity</td>
	            <td>起始Cell座落地址</td>
	            <td>結束Cell Global Identity</td>
	            <td>結束Cell座落地址</td>
	            <td>期間網路上傳使用量</td>
	            <td>期間網路下載使用量</td>
	            <td>期間網路總共使用量</td>
	            <td>手機序號</td>
	            <td>備註</td>
	          </tr>
			  <xsl:for-each select="response:CellInfo">
			  <tr>
			    <td><xsl:value-of select="response:StartDT"/></td>
				<td><xsl:value-of select="response:Duration"/></td>
				<td><xsl:value-of select="response:EndDT"/></td>
				<td><xsl:value-of select="response:CellID"/></td>
				<td><xsl:value-of select="response:CellAddress"/></td>
				<td><xsl:value-of select="response:CellEndID"/></td>
				<td><xsl:value-of select="response:CellEndAddress"/></td>
				<td><xsl:value-of select="response:UploadDataUsage"/><xsl:value-of select="response:UploadDataUsage/@Unit" /></td>
				<td><xsl:value-of select="response:DownloadDataUsage"/><xsl:value-of select="response:DownloadDataUsage/@Unit" /></td>
				<td><xsl:value-of select="response:TotalDataUsage"/><xsl:value-of select="response:TotalDataUsage/@Unit" /></td>
				<td><xsl:value-of select="response:IMEI"/></td>
				<td><xsl:value-of select="response:Note"/></td>
			  </tr>
			  </xsl:for-each> 
			</table>
			</xsl:if>
	
			<xsl:if test="$wifi_info != ''">
			<xsl:for-each select="response:WiFiInfo">
			
			<table border="1">
			  <tr align="center">
	            <td>WiFi設備編號</td>
	            <td>WiFi設備地址</td>
	            <td>WiFi設備種類</td>
	            <td>WiFi設備的IP</td>
	            <td>WiFi設備的MAC</td>
	            <td>WiFi設備的經度</td>
	            <td>WiFi設備的緯度</td>
	            <td>室內/室外</td>
	            <td>備註</td>
	          </tr>

			    <xsl:for-each select="response:WiFiApInfo">
				
			  <xsl:variable name="indoor_outdoor">
		      <xsl:choose>
		        <xsl:when test="response:InDoorOutDoor='INDOOR'"><xsl:value-of select="'室內'" /></xsl:when>
  		        <xsl:when test="response:InDoorOutDoor='OUTDOOR'"><xsl:value-of select="'室外'" /></xsl:when>
		        <xsl:otherwise><xsl:value-of select="'unknown'" /></xsl:otherwise>
		      </xsl:choose>
	          </xsl:variable>
			  
			  <tr align="center">
	            <td><xsl:value-of select="response:WiFiApID"/></td>
	            <td><xsl:value-of select="response:WiFiApAddress"/></td>
	            <td><xsl:value-of select="response:WiFiApType"/></td>
	            <td><xsl:value-of select="response:WiFiApIP"/></td>
	            <td><xsl:value-of select="response:WiFiApMAC"/></td>
	            <td><xsl:value-of select="response:Longitude"/></td>
	            <td><xsl:value-of select="response:Latitude"/></td>
	            <td><xsl:value-of select="$indoor_outdoor"/></td>
	            <td><xsl:value-of select="response:Note"/></td>
	          </tr>
				
			    </xsl:for-each>

	        </table>
	        <p/>
	        <table border="1">  
	          <tr align="center">
	            <td>上線時間</td>
	            <td>使用時間(秒)</td>
	            <td>下線時間</td>
	            <td>期間網路上傳使用量</td>
	            <td>期間網路下載使用量</td>
	            <td>期間網路總共使用量</td>
	            <td>使用者上網連線帳號</td>
	            <td>使用者上網設備配發的IP</td>
	            <td>使用者上網設備MAC</td>
	            <td>備註</td>
	          </tr>
	
			  <xsl:for-each select="response:WiFiAccessInfo">
			  <tr>
			    <td><xsl:value-of select="response:StartDT"/></td>
				<td><xsl:value-of select="response:Duration"/></td>
				<td><xsl:value-of select="response:EndDT"/></td>
				<td><xsl:value-of select="response:UploadDataUsage"/><xsl:value-of select="response:UploadDataUsage/@Unit" /></td>
				<td><xsl:value-of select="response:DownloadDataUsage"/><xsl:value-of select="response:DownloadDataUsage/@Unit" /></td>
				<td><xsl:value-of select="response:TotalDataUsage"/><xsl:value-of select="response:TotalDataUsage/@Unit" /></td>
				<td><xsl:value-of select="response:UserAccount"/></td>
				<td><xsl:value-of select="response:UserDeviceIP"/></td>
				<td><xsl:value-of select="response:UserDeviceMAC"/></td>
				<td><xsl:value-of select="response:Note"/></td>
			  </tr>
			  </xsl:for-each>
			  
	        </table>
			<br/><br/>
			</xsl:for-each>
			</xsl:if>
		
		</xsl:if>
	  </xsl:for-each>

        <hr/>
    </xsl:for-each>

    </BASEFONT>
  </BODY>
</HTML>
</xsl:template>
</xsl:stylesheet>