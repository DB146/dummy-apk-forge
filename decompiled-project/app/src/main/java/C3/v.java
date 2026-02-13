package C3;

import android.util.Log;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class v extends Exception {

    /* renamed from: f, reason: collision with root package name */
    public static final StackTraceElement[] f2634f = new StackTraceElement[0];

    /* renamed from: a, reason: collision with root package name */
    public final List f2635a;

    /* renamed from: b, reason: collision with root package name */
    public A3.h f2636b;

    /* renamed from: c, reason: collision with root package name */
    public A3.a f2637c;

    /* renamed from: d, reason: collision with root package name */
    public Class f2638d;

    /* renamed from: e, reason: collision with root package name */
    public final String f2639e;

    public v(String str) {
        this(str, Collections.emptyList());
    }

    public v(String str, List list) {
        this.f2639e = str;
        setStackTrace(f2634f);
        this.f2635a = list;
    }

    public static void a(Throwable th, ArrayList arrayList) {
        if (!(th instanceof v)) {
            arrayList.add(th);
            return;
        }
        Iterator it = ((v) th).f2635a.iterator();
        while (it.hasNext()) {
            a((Throwable) it.next(), arrayList);
        }
    }

    public static void b(List list, u uVar) {
        int size = list.size();
        int i7 = 0;
        while (i7 < size) {
            uVar.append("Cause (");
            int i10 = i7 + 1;
            uVar.append(String.valueOf(i10));
            uVar.append(" of ");
            uVar.append(String.valueOf(size));
            uVar.append("): ");
            Throwable th = (Throwable) list.get(i7);
            if (th instanceof v) {
                ((v) th).e(uVar);
            } else {
                c(th, uVar);
            }
            i7 = i10;
        }
    }

    public static void c(Throwable th, Appendable appendable) {
        try {
            appendable.append(th.getClass().toString()).append(": ").append(th.getMessage()).append('\n');
        } catch (IOException unused) {
            throw new RuntimeException(th);
        }
    }

    public final void d() {
        ArrayList arrayList = new ArrayList();
        a(this, arrayList);
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            StringBuilder sb2 = new StringBuilder("Root cause (");
            int i10 = i7 + 1;
            sb2.append(i10);
            sb2.append(" of ");
            sb2.append(size);
            sb2.append(")");
            Log.i("Glide", sb2.toString(), (Throwable) arrayList.get(i7));
            i7 = i10;
        }
    }

    public final void e(Appendable appendable) {
        c(this, appendable);
        try {
            b(this.f2635a, new u(appendable));
        } catch (IOException e2) {
            throw new RuntimeException(e2);
        }
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        return this;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        String str;
        String str2;
        StringBuilder sb2 = new StringBuilder(71);
        sb2.append(this.f2639e);
        String str3 = "";
        if (this.f2638d != null) {
            str = ", " + this.f2638d;
        } else {
            str = "";
        }
        sb2.append(str);
        if (this.f2637c != null) {
            str2 = ", " + this.f2637c;
        } else {
            str2 = "";
        }
        sb2.append(str2);
        if (this.f2636b != null) {
            str3 = ", " + this.f2636b;
        }
        sb2.append(str3);
        ArrayList arrayList = new ArrayList();
        a(this, arrayList);
        if (arrayList.isEmpty()) {
            return sb2.toString();
        }
        if (arrayList.size() == 1) {
            sb2.append("\nThere was 1 root cause:");
        } else {
            sb2.append("\nThere were ");
            sb2.append(arrayList.size());
            sb2.append(" root causes:");
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Throwable th = (Throwable) it.next();
            sb2.append('\n');
            sb2.append(th.getClass().getName());
            sb2.append('(');
            sb2.append(th.getMessage());
            sb2.append(')');
        }
        sb2.append("\n call GlideException#logRootCauses(String) for more detail");
        return sb2.toString();
    }

    @Override // java.lang.Throwable
    public final void printStackTrace() {
        e(System.err);
    }

    @Override // java.lang.Throwable
    public final void printStackTrace(PrintStream printStream) {
        e(printStream);
    }

    @Override // java.lang.Throwable
    public final void printStackTrace(PrintWriter printWriter) {
        e(printWriter);
    }
}
