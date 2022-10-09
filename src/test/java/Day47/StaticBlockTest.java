package Day47;

public class StaticBlockTest {

    StaticBlocks stcBlk = new StaticBlocks();
    static {
        StaticBlocks stcBlk = new StaticBlocks();
    }

    public static void main(String[] args) {
        StaticBlocks stcBlk = new StaticBlocks();

        stcBlk.main(new String[]{"a","b"});
    }


}
