

# ZipLookupCity


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**city** | [**City**](City.md) |  |  |
|**state** | **String** | The &lt;a href&#x3D;\&quot;https://en.wikipedia.org/wiki/ISO_3166-2\&quot; target&#x3D;\&quot;_blank\&quot;&gt;ISO 3166-2&lt;/a&gt; two letter code for the state.  |  |
|**county** | **String** | County name of the address city. |  |
|**countyFips** | **String** | A 5-digit &lt;a href&#x3D;\&quot;https://en.wikipedia.org/wiki/FIPS_county_code\&quot; target&#x3D;\&quot;_blank\&quot;&gt;FIPS county code&lt;/a&gt; which uniquely identifies &#x60;components[county]&#x60;. It consists of a 2-digit state code and a 3-digit county code.  |  |
|**preferred** | **Boolean** | Indicates whether or not the city is the &lt;a href&#x3D;\&quot;https://en.wikipedia.org/wiki/ZIP_Code#ZIP_Codes_and_previous_zoning_lines\&quot; target&#x3D;\&quot;_blank\&quot;&gt;USPS default city&lt;/a&gt; (preferred city) of a ZIP code. There is only one preferred city per ZIP code, which will always be in position 0 in the array of cities.  |  |



