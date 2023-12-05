# TemplateVersionDeletion

Lob uses RESTful HTTP response codes to indicate success or failure of an API request. In general, 2xx indicates success, 4xx indicate an input error, and 5xx indicates an error on Lob's end.


## Fields

| Field                                                        | Type                                                         | Required                                                     | Description                                                  |
| ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ |
| `id`                                                         | *String*                                                     | :heavy_minus_sign:                                           | Unique identifier prefixed with `vrsn_`.                     |
| `deleted`                                                    | *Boolean*                                                    | :heavy_minus_sign:                                           | Only returned if the resource has been successfully deleted. |