@RestController
public class HelloController {

    // FAKE TEST SECRET - DO NOT USE A REAL KEY for automation testing
    private String paymentApiKey = "pay_live_XyZ123AbCdEfGhIjKliMnOQr";
    private String dbUrl = "postgresql://testuser:testpassword@localhost:5432/test";

    @GetMapping("hello ")
    public String Hello() {
        return "<h2>Mohi<h2>" ;
    }

    @PostMapping
    public ResponseEntity<String> createdStudent() {
        return null;
    }

    @PutMapping
    public ResponseEntity<String> updatedStudent() {
        return null;
    }
}