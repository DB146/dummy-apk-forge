package A4;

import android.database.sqlite.SQLiteDatabase;
import android.util.Log;
import java.io.File;

/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f367a;

    /* renamed from: b, reason: collision with root package name */
    public int f368b;

    public /* synthetic */ c(int i7, int i10) {
        this.f367a = i10;
        this.f368b = i7;
    }

    public static int F(int i7) {
        return (i7 >> 24) & 255;
    }

    public static void f(String str) {
        if (str.equalsIgnoreCase(":memory:")) {
            return;
        }
        int length = str.length() - 1;
        int i7 = 0;
        boolean z8 = false;
        while (i7 <= length) {
            boolean z10 = kotlin.jvm.internal.l.f(str.charAt(!z8 ? i7 : length), 32) <= 0;
            if (z8) {
                if (!z10) {
                    break;
                } else {
                    length--;
                }
            } else if (z10) {
                i7++;
            } else {
                z8 = true;
            }
        }
        if (str.subSequence(i7, length + 1).toString().length() == 0) {
            return;
        }
        Log.w("SupportSQLite", "deleting the database file: ".concat(str));
        try {
            SQLiteDatabase.deleteDatabase(new File(str));
        } catch (Exception e2) {
            Log.w("SupportSQLite", "delete failed: ", e2);
        }
    }

    public static String g(int i7) {
        return "" + ((char) ((i7 >> 24) & 255)) + ((char) ((i7 >> 16) & 255)) + ((char) ((i7 >> 8) & 255)) + ((char) (i7 & 255));
    }

    public abstract void B(V2.c cVar);

    public abstract void C(V2.c cVar, int i7, int i10);

    public abstract void D(V2.c cVar);

    public abstract void E(V2.c cVar, int i7, int i10);

    public void a(int i7) {
        this.f368b = i7 | this.f368b;
    }

    public boolean i(int i7) {
        return (this.f368b & i7) == i7;
    }

    public abstract int r();

    public abstract int t();

    public String toString() {
        switch (this.f367a) {
            case 0:
                return g(this.f368b);
            default:
                return super.toString();
        }
    }

    public abstract int u();

    public abstract int v();

    public abstract int y();

    public void z(V2.c cVar) {
    }
}
