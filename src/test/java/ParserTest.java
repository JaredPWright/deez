import static org.junit.Assert.assertEquals;
import org.junit.Test;
import SST.parser;

public class ParserTest {
    @Test
    public void checkParser(){
        assert (parser.Parse("SR"));
    }
}
