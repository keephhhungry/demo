package demo.idgenerator;

/**
 * @ahthor : cxyxh
 * @date : 2020/12/19 9:43
 * @describetion :
 */
public interface IdGenerator {
    String generate() throws IdGenerationFailureException;
}
