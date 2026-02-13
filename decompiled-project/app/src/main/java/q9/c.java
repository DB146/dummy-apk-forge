package q9;

import android.hardware.Camera;
import android.util.Log;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f23558a = 0;

    static {
        Pattern.compile(";");
    }

    public static String a(String str, List list, String... strArr) {
        StringBuilder n6 = X.c.n("Requesting ", str, " value from among: ");
        n6.append(Arrays.toString(strArr));
        Log.i("CameraConfiguration", n6.toString());
        Log.i("CameraConfiguration", "Supported " + str + " values: " + list);
        if (list != null) {
            for (String str2 : strArr) {
                if (list.contains(str2)) {
                    Log.i("CameraConfiguration", "Can set " + str + " to: " + str2);
                    return str2;
                }
            }
        }
        Log.i("CameraConfiguration", "No supported values match");
        return null;
    }

    public static void b(Camera.Parameters parameters, boolean z8) {
        List<String> supportedFlashModes = parameters.getSupportedFlashModes();
        String a9 = z8 ? a("flash mode", supportedFlashModes, "torch", "on") : a("flash mode", supportedFlashModes, "off");
        if (a9 != null) {
            if (a9.equals(parameters.getFlashMode())) {
                Log.i("CameraConfiguration", "Flash mode already set to ".concat(a9));
            } else {
                Log.i("CameraConfiguration", "Setting flash mode to ".concat(a9));
                parameters.setFlashMode(a9);
            }
        }
    }
}
