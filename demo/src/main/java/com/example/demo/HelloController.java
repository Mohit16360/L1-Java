@RestController
public class HelloController {

    // FAKE TEST SECRET - DO NOT USE A REAL KEY for automation testing
    private String paymentApiKey = "pk_live_QqWwEeRrTtYyUuIiOoPpAaSs";
    private String dbUrl = "mongodb://user05:pass05@localhost:27017/testdb05";


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

    @PutMapping
    public ResponseEntity<String> updatedStudent() {
        return null;
    }
}