# UploadExportCreateResponseBody

Create Export Error


## Fields

| Field                                                      | Type                                                       | Required                                                   | Description                                                |
| ---------------------------------------------------------- | ---------------------------------------------------------- | ---------------------------------------------------------- | ---------------------------------------------------------- |
| `code`                                                     | *Double*                                                   | :heavy_check_mark:                                         | A conventional HTTP status code                            |
| `message`                                                  | *String*                                                   | :heavy_check_mark:                                         | A human-readable message with more details about the error |
| `errors`                                                   | List<*String*>                                             | :heavy_check_mark:                                         | An array of pre-defined strings that identify an error     |