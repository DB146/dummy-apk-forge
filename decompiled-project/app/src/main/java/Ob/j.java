package Ob;

import java.io.File;
import kotlin.jvm.internal.l;

/* loaded from: classes2.dex */
public abstract class j extends vc.i {
    public static String J(File file) {
        l.e(file, "<this>");
        String name = file.getName();
        l.d(name, "getName(...)");
        int j02 = ac.g.j0(name, '.', 0, 6);
        if (j02 == -1) {
            return "";
        }
        String substring = name.substring(j02 + 1, name.length());
        l.d(substring, "substring(...)");
        return substring;
    }
}
