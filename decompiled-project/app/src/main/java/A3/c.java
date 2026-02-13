package A3;

import W1.C;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.recyclerview.widget.RecyclerView;
import l2.H;
import n5.AbstractC1705a;
import y9.D;

/* loaded from: classes.dex */
public abstract /* synthetic */ class c {
    public static final void a(int i7, View view, ViewGroup container) {
        kotlin.jvm.internal.l.e(view, "view");
        kotlin.jvm.internal.l.e(container, "container");
        int b2 = P.c.b(i7);
        if (b2 == 0) {
            ViewParent parent = view.getParent();
            ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup != null) {
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Removing view " + view + " from container " + viewGroup);
                }
                viewGroup.removeView(view);
                return;
            }
            return;
        }
        if (b2 == 1) {
            if (Log.isLoggable("FragmentManager", 2)) {
                Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to VISIBLE");
            }
            ViewParent parent2 = view.getParent();
            if ((parent2 instanceof ViewGroup ? (ViewGroup) parent2 : null) == null) {
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Adding view " + view + " to Container " + container);
                }
                container.addView(view);
            }
            view.setVisibility(0);
            return;
        }
        if (b2 == 2) {
            if (Log.isLoggable("FragmentManager", 2)) {
                Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to GONE");
            }
            view.setVisibility(8);
            return;
        }
        if (b2 != 3) {
            return;
        }
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to INVISIBLE");
        }
        view.setVisibility(4);
    }

    public static /* synthetic */ boolean b(int i7) {
        if (i7 == 1 || i7 == 2 || i7 == 3) {
            return false;
        }
        if (i7 == 4 || i7 == 5) {
            return true;
        }
        throw null;
    }

    public static int c(int i7, int i10, int i11) {
        return (Integer.hashCode(i7) + i10) * i11;
    }

    public static int d(int i7, int i10, String str) {
        return (str.hashCode() + i7) * i10;
    }

    public static String e(int i7, int i10, String str, String str2, String str3) {
        return str + i7 + str2 + i10 + str3;
    }

    public static String f(int i7, String str, String str2) {
        return str + i7 + str2;
    }

    public static String g(RecyclerView recyclerView, StringBuilder sb2) {
        sb2.append(recyclerView.B());
        return sb2.toString();
    }

    public static String h(String str, long j) {
        return str + j;
    }

    public static String i(String str, C c10, String str2) {
        return str + c10 + str2;
    }

    public static String j(String str, String str2, String str3, String str4) {
        return str + str2 + str3 + str4;
    }

    public static String k(StringBuilder sb2, int i7, String str) {
        sb2.append(i7);
        sb2.append(str);
        return sb2.toString();
    }

    public static String l(StringBuilder sb2, String str, char c10) {
        sb2.append(str);
        sb2.append(c10);
        return sb2.toString();
    }

    public static String m(StringBuilder sb2, String str, String str2, String str3) {
        sb2.append(str);
        sb2.append(str2);
        sb2.append(str3);
        return sb2.toString();
    }

    public static StringBuilder n(String str, String str2) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(str2);
        return sb2;
    }

    public static StringBuilder o(String str, String str2, String str3, String str4, String str5) {
        StringBuilder sb2 = new StringBuilder(str);
        sb2.append(str2);
        sb2.append(str3);
        sb2.append(str4);
        sb2.append(str5);
        return sb2;
    }

    public static /* synthetic */ void p(Object obj) {
        if (obj != null) {
            throw new ClassCastException();
        }
    }

    public static void q(String str, String str2, String str3) {
        AbstractC1705a.S(str3, str + str2);
    }

    public static void r(Throwable th, H h10) {
        h10.l(new D(th));
    }

    public static /* synthetic */ String s(int i7) {
        switch (i7) {
            case 1:
                return "INITIALIZE";
            case 2:
                return "RESOURCE_CACHE";
            case 3:
                return "DATA_CACHE";
            case 4:
                return "SOURCE";
            case 5:
                return "ENCODE";
            case 6:
                return "FINISHED";
            default:
                return "null";
        }
    }

    public static /* synthetic */ String t(int i7) {
        switch (i7) {
            case 1:
                return "BEGIN_ARRAY";
            case 2:
                return "END_ARRAY";
            case 3:
                return "BEGIN_OBJECT";
            case 4:
                return "END_OBJECT";
            case 5:
                return "NAME";
            case 6:
                return "STRING";
            case 7:
                return "NUMBER";
            case P1.g.BYTES_FIELD_NUMBER /* 8 */:
                return "BOOLEAN";
            case 9:
                return "NULL";
            case 10:
                return "END_DOCUMENT";
            default:
                return "null";
        }
    }

    public static /* synthetic */ String u(int i7) {
        return i7 != 1 ? i7 != 2 ? "null" : "V2" : "V1";
    }

    public static /* synthetic */ String v(int i7) {
        return i7 != 1 ? i7 != 2 ? i7 != 3 ? "null" : "REMOVING" : "ADDING" : "NONE";
    }

    public static /* synthetic */ String w(int i7) {
        return i7 != 1 ? i7 != 2 ? i7 != 3 ? i7 != 4 ? "null" : "INVISIBLE" : "GONE" : "VISIBLE" : "REMOVED";
    }
}
