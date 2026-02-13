package W1;

import android.R;
import android.os.Bundle;
import android.util.Log;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import l2.EnumC1474s;

/* renamed from: W1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0558a implements Q {

    /* renamed from: a, reason: collision with root package name */
    public final M f10407a;

    /* renamed from: b, reason: collision with root package name */
    public final ClassLoader f10408b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f10409c;

    /* renamed from: d, reason: collision with root package name */
    public int f10410d;

    /* renamed from: e, reason: collision with root package name */
    public int f10411e;

    /* renamed from: f, reason: collision with root package name */
    public int f10412f;
    public int g;

    /* renamed from: h, reason: collision with root package name */
    public int f10413h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f10414i;
    public boolean j;
    public String k;

    /* renamed from: l, reason: collision with root package name */
    public int f10415l;

    /* renamed from: m, reason: collision with root package name */
    public CharSequence f10416m;

    /* renamed from: n, reason: collision with root package name */
    public int f10417n;

    /* renamed from: o, reason: collision with root package name */
    public CharSequence f10418o;

    /* renamed from: p, reason: collision with root package name */
    public ArrayList f10419p;

    /* renamed from: q, reason: collision with root package name */
    public ArrayList f10420q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f10421r;

    /* renamed from: s, reason: collision with root package name */
    public final U f10422s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f10423t;

    /* renamed from: u, reason: collision with root package name */
    public int f10424u;

    public C0558a(U u3) {
        M J10 = u3.J();
        F f4 = u3.f10374w;
        ClassLoader classLoader = f4 != null ? f4.f10311b.getClassLoader() : null;
        this.f10409c = new ArrayList();
        this.j = true;
        this.f10421r = false;
        this.f10407a = J10;
        this.f10408b = classLoader;
        this.f10424u = -1;
        this.f10422s = u3;
    }

    @Override // W1.Q
    public final boolean a(ArrayList arrayList, ArrayList arrayList2) {
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Run: " + this);
        }
        arrayList.add(this);
        arrayList2.add(Boolean.FALSE);
        if (!this.f10414i) {
            return true;
        }
        this.f10422s.f10358d.add(this);
        return true;
    }

    public final void b(c0 c0Var) {
        this.f10409c.add(c0Var);
        c0Var.f10455d = this.f10410d;
        c0Var.f10456e = this.f10411e;
        c0Var.f10457f = this.f10412f;
        c0Var.g = this.g;
    }

    public final void c(String str) {
        if (!this.j) {
            throw new IllegalStateException("This FragmentTransaction is not allowed to be added to the back stack.");
        }
        this.f10414i = true;
        this.k = str;
    }

    public final void d(int i7) {
        if (this.f10414i) {
            if (Log.isLoggable("FragmentManager", 2)) {
                Log.v("FragmentManager", "Bump nesting in " + this + " by " + i7);
            }
            ArrayList arrayList = this.f10409c;
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                c0 c0Var = (c0) arrayList.get(i10);
                C c10 = c0Var.f10453b;
                if (c10 != null) {
                    c10.f10264G += i7;
                    if (Log.isLoggable("FragmentManager", 2)) {
                        Log.v("FragmentManager", "Bump nesting of " + c0Var.f10453b + " to " + c0Var.f10453b.f10264G);
                    }
                }
            }
        }
    }

    public final int e(boolean z8) {
        if (this.f10423t) {
            throw new IllegalStateException("commit already called");
        }
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Commit: " + this);
            PrintWriter printWriter = new PrintWriter(new m0());
            h("  ", printWriter, true);
            printWriter.close();
        }
        this.f10423t = true;
        boolean z10 = this.f10414i;
        U u3 = this.f10422s;
        if (z10) {
            this.f10424u = u3.j.getAndIncrement();
        } else {
            this.f10424u = -1;
        }
        u3.y(this, z8);
        return this.f10424u;
    }

    public final void f() {
        if (this.f10414i) {
            throw new IllegalStateException("This transaction is already being added to the back stack");
        }
        this.j = false;
        this.f10422s.B(this, false);
    }

    public final void g(int i7, C c10, String str, int i10) {
        String str2 = c10.f10284a0;
        if (str2 != null) {
            X1.d.c(c10, str2);
        }
        Class<?> cls = c10.getClass();
        int modifiers = cls.getModifiers();
        if (cls.isAnonymousClass() || !Modifier.isPublic(modifiers) || (cls.isMemberClass() && !Modifier.isStatic(modifiers))) {
            throw new IllegalStateException("Fragment " + cls.getCanonicalName() + " must be a public static class to be  properly recreated from instance state.");
        }
        if (str != null) {
            String str3 = c10.f10270N;
            if (str3 != null && !str.equals(str3)) {
                StringBuilder sb2 = new StringBuilder("Can't change tag of fragment ");
                sb2.append(c10);
                sb2.append(": was ");
                throw new IllegalStateException(A3.c.m(sb2, c10.f10270N, " now ", str));
            }
            c10.f10270N = str;
        }
        if (i7 != 0) {
            if (i7 == -1) {
                throw new IllegalArgumentException("Can't add fragment " + c10 + " with tag " + str + " to container view with no id");
            }
            int i11 = c10.L;
            if (i11 != 0 && i11 != i7) {
                throw new IllegalStateException("Can't change container ID of fragment " + c10 + ": was " + c10.L + " now " + i7);
            }
            c10.L = i7;
            c10.f10269M = i7;
        }
        b(new c0(i10, c10));
        c10.f10265H = this.f10422s;
    }

    public final void h(String str, PrintWriter printWriter, boolean z8) {
        String str2;
        if (z8) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.k);
            printWriter.print(" mIndex=");
            printWriter.print(this.f10424u);
            printWriter.print(" mCommitted=");
            printWriter.println(this.f10423t);
            if (this.f10413h != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.f10413h));
            }
            if (this.f10410d != 0 || this.f10411e != 0) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f10410d));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.f10411e));
            }
            if (this.f10412f != 0 || this.g != 0) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f10412f));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.g));
            }
            if (this.f10415l != 0 || this.f10416m != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.f10415l));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.f10416m);
            }
            if (this.f10417n != 0 || this.f10418o != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.f10417n));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.f10418o);
            }
        }
        ArrayList arrayList = this.f10409c;
        if (arrayList.isEmpty()) {
            return;
        }
        printWriter.print(str);
        printWriter.println("Operations:");
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            c0 c0Var = (c0) arrayList.get(i7);
            switch (c0Var.f10452a) {
                case 0:
                    str2 = "NULL";
                    break;
                case 1:
                    str2 = "ADD";
                    break;
                case 2:
                    str2 = "REPLACE";
                    break;
                case 3:
                    str2 = "REMOVE";
                    break;
                case 4:
                    str2 = "HIDE";
                    break;
                case 5:
                    str2 = "SHOW";
                    break;
                case 6:
                    str2 = "DETACH";
                    break;
                case 7:
                    str2 = "ATTACH";
                    break;
                case P1.g.BYTES_FIELD_NUMBER /* 8 */:
                    str2 = "SET_PRIMARY_NAV";
                    break;
                case 9:
                    str2 = "UNSET_PRIMARY_NAV";
                    break;
                case 10:
                    str2 = "OP_SET_MAX_LIFECYCLE";
                    break;
                default:
                    str2 = "cmd=" + c0Var.f10452a;
                    break;
            }
            printWriter.print(str);
            printWriter.print("  Op #");
            printWriter.print(i7);
            printWriter.print(": ");
            printWriter.print(str2);
            printWriter.print(" ");
            printWriter.println(c0Var.f10453b);
            if (z8) {
                if (c0Var.f10455d != 0 || c0Var.f10456e != 0) {
                    printWriter.print(str);
                    printWriter.print("enterAnim=#");
                    printWriter.print(Integer.toHexString(c0Var.f10455d));
                    printWriter.print(" exitAnim=#");
                    printWriter.println(Integer.toHexString(c0Var.f10456e));
                }
                if (c0Var.f10457f != 0 || c0Var.g != 0) {
                    printWriter.print(str);
                    printWriter.print("popEnterAnim=#");
                    printWriter.print(Integer.toHexString(c0Var.f10457f));
                    printWriter.print(" popExitAnim=#");
                    printWriter.println(Integer.toHexString(c0Var.g));
                }
            }
        }
    }

    public final void i(C c10) {
        U u3 = c10.f10265H;
        if (u3 == null || u3 == this.f10422s) {
            b(new c0(3, c10));
            return;
        }
        throw new IllegalStateException("Cannot remove Fragment attached to a different FragmentManager. Fragment " + c10.toString() + " is already attached to a FragmentManager.");
    }

    public final void j(int i7, C c10, String str) {
        if (i7 == 0) {
            throw new IllegalArgumentException("Must use non-zero containerViewId");
        }
        g(i7, c10, str, 2);
    }

    public final void k(Bundle bundle, Class cls) {
        M m10 = this.f10407a;
        if (m10 == null) {
            throw new IllegalStateException("Creating a Fragment requires that this FragmentTransaction was built with FragmentManager.beginTransaction()");
        }
        if (this.f10408b == null) {
            throw new IllegalStateException("The FragmentManager must be attached to itshost to create a Fragment");
        }
        C a9 = m10.a(cls.getName());
        if (bundle != null) {
            a9.l0(bundle);
        }
        j(R.id.content, a9, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [W1.c0, java.lang.Object] */
    public final void l(C c10, EnumC1474s enumC1474s) {
        U u3 = c10.f10265H;
        U u10 = this.f10422s;
        if (u3 != u10) {
            throw new IllegalArgumentException("Cannot setMaxLifecycle for Fragment not attached to FragmentManager " + u10);
        }
        if (enumC1474s == EnumC1474s.f19228b && c10.f10283a > -1) {
            throw new IllegalArgumentException("Cannot set maximum Lifecycle to " + enumC1474s + " after the Fragment has been created");
        }
        if (enumC1474s == EnumC1474s.f19227a) {
            throw new IllegalArgumentException("Cannot set maximum Lifecycle to " + enumC1474s + ". Use remove() to remove the fragment from the FragmentManager and trigger its destruction.");
        }
        ?? obj = new Object();
        obj.f10452a = 10;
        obj.f10453b = c10;
        obj.f10454c = false;
        obj.f10458h = c10.f10286b0;
        obj.f10459i = enumC1474s;
        b(obj);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append("BackStackEntry{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.f10424u >= 0) {
            sb2.append(" #");
            sb2.append(this.f10424u);
        }
        if (this.k != null) {
            sb2.append(" ");
            sb2.append(this.k);
        }
        sb2.append("}");
        return sb2.toString();
    }
}
