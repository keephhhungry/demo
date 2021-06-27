package demo;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Calendar;
import java.util.Random;

/**
 * @ahthor : cxyxh
 * @date : 2020/12/19 9:24
 * @describetion :
 * 第一轮重构：提高代码的可读性
 * 第二轮重构：提高代码的可测试性
 * 第三轮重构：编写完善的单元测试
 * 第四轮重构：所有重构完成之后添加注释
 */
public class IdGenerator {

    public static void main(String[] args) {
        String generate = generate();
        System.out.println("id:"+generate);
        Calendar instance = Calendar.getInstance();
    }

    public static String generate() {
        String id = "";
        try {
            String hostName = InetAddress.getLocalHost().getHostName();
            System.out.println("hostName:"+hostName);
            String[] tokens = hostName.split("\\.");
            if (tokens.length > 0) {
                hostName = tokens[tokens.length - 1];
            }
            char[] randomChars = new char[8];
            int count = 0;
            Random random = new Random();
            while (count < 8) {
                int randomAscii = random.nextInt(122);
                if (randomAscii >= 48 && randomAscii <= 57) {
                    randomChars[count] = (char)('0' + (randomAscii - 48));
                    count++;
                } else if (randomAscii >= 65 && randomAscii <= 90) {
                    randomChars[count] = (char)('A' + (randomAscii - 65));
                    count++;
                } else if (randomAscii >= 97 && randomAscii <= 122) {
                    randomChars[count] = (char)('a' + (randomAscii - 97));
                    count++;
                }
            }
            id = String.format("%s-%d-%s", hostName,System.currentTimeMillis(), new String(randomChars));
        } catch (UnknownHostException e) {
//            logger.warn("Failed to get the host name.", e);
            System.out.println("Failed to get the host name");
        }
        return id;
    }
}
