
# Qr Code

Customize and place a QR code on the creative at the required position.

## Structure

`QrCode`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Position` | `String` | Required, Constant | Sets how a QR code is being positioned in the document. Together with this, you should provide one of 'top' or 'bottom', and one of 'left' or 'right'.<br>**Default**: `"relative"` | String getPosition() | setPosition(String position) |
| `Top` | `String` | Optional | Vertical distance (in inches) to place QR code from the top. Only allowed if "bottom" isn't provided. | String getTop() | setTop(String top) |
| `Right` | `String` | Optional | Horizonal distance (in inches) to place QR code from the right. Only allowed if "left" isn't provided. | String getRight() | setRight(String right) |
| `Left` | `String` | Optional | Horizonal distance (in inches) to place QR code from the left. Only allowed if "right" isn't provided. | String getLeft() | setLeft(String left) |
| `Bottom` | `String` | Optional | Vertical distance (in inches) to place QR code from the bottom. Only allowed if "top" isn't provided. | String getBottom() | setBottom(String bottom) |
| `RedirectUrl` | `String` | Required | The url to redirect the user when a QR code is scanned. The url must start with `https://` | String getRedirectUrl() | setRedirectUrl(String redirectUrl) |
| `Width` | `String` | Required | The size (in inches) of the QR code with a minimum of 1 inch. All QR codes are generated as a square. | String getWidth() | setWidth(String width) |
| `Pages` | `String` | Optional | Specify the pages where the QR code should be stamped in a comma separated format. Your QR code can be printed in the same position on multiple pages. For postcards, the values should either be "front", "back" (for either front or back) or "front,back" (for the QR code to be printed on both sides). For self-mailers, the values should either be "inside", "outside" (for either inside or outside) or "inside,outside" (for the QR code to be printed on both sides). For letters, the values can be specific page numbers ("1", "3"), page number ranges such as "1-3", or a comma separated combination of both ("1,3,5-7"). | String getPages() | setPages(String pages) |

## Example (as JSON)

```json
{
  "position": "relative",
  "redirect_url": "redirect_url8",
  "width": "width0",
  "top": "top8",
  "right": "right2",
  "left": "left2",
  "bottom": "bottom4",
  "pages": "pages0"
}
```

