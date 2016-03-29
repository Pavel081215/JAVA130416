package golovachCourses;

import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader;

import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

/**
 * Created by Pavel on 25.03.2016.
 */
public class HttpUtils {
    public static boolean isReqvestEnd(byte[] request, int length) {
        if (length < 4) {
            return false;
        }
        return request[length - 4] == '\r' &&
                request[length - 3] == '\n' &&
                request[length - 2] == '\r' &&
                request[length - 1] == '\n';
    }

    public static byte[] readRequestFully(InputStream in) throws IOException {
        byte[] buff = new byte[8192];
        int headerLen = 0;
        while (true) {
            int count = in.read(buff,headerLen,buff.length - headerLen);//,headerLen,buff.length - headerLen
            if (count < 0) {
                throw new RuntimeException("Incoming connection closed but .....  ");
            } else {
                headerLen += count;
                if (isReqvestEnd(buff, headerLen)) {
                    return  Arrays.copyOfRange(buff, 0, headerLen);
                }
                if (headerLen == buff.length) {
                    throw new RuntimeException("Too big HTTP header .....  ");
                }
            }
        }
    }
}

