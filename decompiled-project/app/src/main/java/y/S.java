package y;

import java.util.HashMap;

/* loaded from: classes.dex */
public abstract /* synthetic */ class S {
    public static /* synthetic */ String a(int i7) {
        if (i7 == 1) {
            return "account_selection_token";
        }
        if (i7 == 2) {
            return "account_selection_state";
        }
        throw null;
    }

    public static String b(String str, String str2, String str3) {
        return str + str2 + str3;
    }

    public static void c(int i7, HashMap hashMap, String str, int i10, String str2) {
        hashMap.put(str, Integer.valueOf(i7));
        hashMap.put(str2, Integer.valueOf(i10));
    }

    public static void d(long j, String str, StringBuilder sb2) {
        sb2.append((Object) j0.n.i(j));
        sb2.append(str);
    }

    public static /* synthetic */ String e(int i7) {
        switch (i7) {
            case 1:
                return "Doctype";
            case 2:
                return "StartTag";
            case 3:
                return "EndTag";
            case 4:
                return "Comment";
            case 5:
                return "Character";
            case 6:
                return "XmlDecl";
            case 7:
                return "EOF";
            default:
                return "null";
        }
    }

    public static /* synthetic */ String f(int i7) {
        return i7 != 1 ? i7 != 2 ? i7 != 3 ? i7 != 4 ? "null" : "FAILED" : "SUCCEEDED" : "RUNNING" : "CLEARED";
    }
}
