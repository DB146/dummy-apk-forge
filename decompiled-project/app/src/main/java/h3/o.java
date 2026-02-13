package h3;

import db.C1068a;
import db.InterfaceC1070c;
import java.util.ArrayList;
import java.util.Iterator;
import m4.L;
import n5.AbstractC1705a;

/* loaded from: classes.dex */
public abstract /* synthetic */ class o {
    public static final boolean a(int i7) {
        return i7 == 3 || i7 == 4 || i7 == 6;
    }

    public static /* synthetic */ boolean b(int i7) {
        switch (i7) {
            case 1:
                return false;
            case 2:
            case 3:
            case 4:
            case 5:
                return true;
            case 6:
            case 7:
            case P1.g.BYTES_FIELD_NUMBER /* 8 */:
                return false;
            default:
                throw null;
        }
    }

    public static /* synthetic */ int c(int i7) {
        int i10 = 1;
        if (i7 != 1) {
            i10 = 2;
            if (i7 != 2) {
                i10 = 3;
                if (i7 != 3) {
                    if (i7 == 4) {
                        return 4;
                    }
                    throw null;
                }
            }
        }
        return i10;
    }

    public static float d(float f4, float f10, float f11, float f12) {
        return ((f4 - f10) * f11) + f12;
    }

    public static int e(float f4, int i7, int i10) {
        return (Float.hashCode(f4) + i7) * i10;
    }

    public static int f(int i7, int i10, long j) {
        return (Long.hashCode(j) + i7) * i10;
    }

    public static int g(boolean z8, int i7, int i10) {
        return (Boolean.hashCode(z8) + i7) * i10;
    }

    public static InterfaceC1070c h(oa.j jVar, int i7) {
        return C1068a.a(new oa.i(jVar, i7));
    }

    public static ClassCastException i(int i7, ArrayList arrayList) {
        arrayList.get(i7).getClass();
        return new ClassCastException();
    }

    public static ClassCastException j(Iterator it) {
        it.next().getClass();
        return new ClassCastException();
    }

    public static Object k(int i7, ArrayList arrayList) {
        return arrayList.get(arrayList.size() - i7);
    }

    public static String l(int i7, String str) {
        return str + i7;
    }

    public static String m(String str, P2.n nVar, String str2, P2.n nVar2) {
        return str + nVar + str2 + nVar2;
    }

    public static String n(String str, String str2, String str3, String str4, String str5) {
        return str + str2 + str3 + str4 + str5;
    }

    public static String o(String str, StringBuilder sb2) {
        return str + ((Object) sb2);
    }

    public static String p(StringBuilder sb2, String str, String str2) {
        sb2.append(str);
        sb2.append(str2);
        return sb2.toString();
    }

    public static StringBuilder q(int i7, int i10, String str, String str2, String str3) {
        StringBuilder sb2 = new StringBuilder(str);
        sb2.append(i7);
        sb2.append(str2);
        sb2.append(i10);
        sb2.append(str3);
        return sb2;
    }

    public static StringBuilder r(int i7, String str, String str2) {
        StringBuilder sb2 = new StringBuilder(str);
        sb2.append(i7);
        sb2.append(str2);
        return sb2;
    }

    public static void s(int i7, int i10, int i11, int i12, int i13) {
        c2.q.a(i7);
        c2.q.a(i10);
        c2.q.a(i11);
        c2.q.a(i12);
        c2.q.a(i13);
    }

    public static /* synthetic */ void t(int i7, String str) {
        if (i7 != 0) {
            return;
        }
        NullPointerException nullPointerException = new NullPointerException(kotlin.jvm.internal.l.g(str));
        kotlin.jvm.internal.l.i(nullPointerException, kotlin.jvm.internal.l.class.getName());
        throw nullPointerException;
    }

    public static void u(int i7, String str, String str2) {
        AbstractC1705a.S(str2, str + i7);
    }

    public static void v(StringBuilder sb2, String str, String str2, String str3, String str4) {
        sb2.append(str);
        sb2.append(str2);
        sb2.append(str3);
        sb2.append(str4);
    }

    public static void w(m4.K k, s4.v vVar) {
        vVar.a(new L(k));
    }

    public static /* synthetic */ String x(int i7) {
        switch (i7) {
            case 1:
                return "NOT_REQUIRED";
            case 2:
                return "CONNECTED";
            case 3:
                return "UNMETERED";
            case 4:
                return "NOT_ROAMING";
            case 5:
                return "METERED";
            case 6:
                return "TEMPORARILY_UNMETERED";
            default:
                return "null";
        }
    }

    public static /* synthetic */ String y(int i7) {
        switch (i7) {
            case 1:
                return "ENQUEUED";
            case 2:
                return "RUNNING";
            case 3:
                return "SUCCEEDED";
            case 4:
                return "FAILED";
            case 5:
                return "BLOCKED";
            case 6:
                return "CANCELLED";
            default:
                return "null";
        }
    }

    public static /* synthetic */ int z(String str) {
        if (str == null) {
            throw new NullPointerException("Name is null");
        }
        if (str.equals("GET")) {
            return 1;
        }
        if (str.equals("POST")) {
            return 2;
        }
        if (str.equals("PUT")) {
            return 3;
        }
        if (str.equals("DELETE")) {
            return 4;
        }
        if (str.equals("PATCH")) {
            return 5;
        }
        if (str.equals("HEAD")) {
            return 6;
        }
        if (str.equals("OPTIONS")) {
            return 7;
        }
        if (str.equals("TRACE")) {
            return 8;
        }
        throw new IllegalArgumentException("No enum constant org.jsoup.Connection.Method.".concat(str));
    }
}
