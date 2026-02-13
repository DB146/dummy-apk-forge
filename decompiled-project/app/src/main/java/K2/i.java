package K2;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Iterator;
import mc.AbstractC1660e;
import mc.C1659d;
import mc.InterfaceC1656a;

/* loaded from: classes.dex */
public final class i implements T2.a, InterfaceC1656a {

    /* renamed from: a, reason: collision with root package name */
    public final T2.a f6035a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC1656a f6036b;

    /* renamed from: c, reason: collision with root package name */
    public Hb.i f6037c;

    /* renamed from: d, reason: collision with root package name */
    public Throwable f6038d;

    public i(T2.a delegate) {
        C1659d a9 = AbstractC1660e.a();
        kotlin.jvm.internal.l.e(delegate, "delegate");
        this.f6035a = delegate;
        this.f6036b = a9;
    }

    public final void F(StringBuilder sb2) {
        if (this.f6037c == null && this.f6038d == null) {
            sb2.append("\t\tStatus: Free connection");
            sb2.append('\n');
            return;
        }
        sb2.append("\t\tStatus: Acquired connection");
        sb2.append('\n');
        Hb.i iVar = this.f6037c;
        if (iVar != null) {
            sb2.append("\t\tCoroutine: " + iVar);
            sb2.append('\n');
        }
        Throwable th = this.f6038d;
        if (th != null) {
            sb2.append("\t\tAcquired:");
            sb2.append('\n');
            StringWriter stringWriter = new StringWriter();
            PrintWriter printWriter = new PrintWriter(stringWriter);
            th.printStackTrace(printWriter);
            printWriter.flush();
            String stringWriter2 = stringWriter.toString();
            kotlin.jvm.internal.l.d(stringWriter2, "toString(...)");
            Iterator it = Eb.o.W(1, Zb.i.P(new Eb.t(stringWriter2, 3))).iterator();
            while (it.hasNext()) {
                sb2.append("\t\t" + ((String) it.next()));
                sb2.append('\n');
            }
        }
    }

    @Override // T2.a
    public final T2.c R(String sql) {
        kotlin.jvm.internal.l.e(sql, "sql");
        return this.f6035a.R(sql);
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.f6035a.close();
    }

    @Override // mc.InterfaceC1656a
    public final void l(Object obj) {
        this.f6036b.l(null);
    }

    @Override // mc.InterfaceC1656a
    public final Object n(Jb.c cVar) {
        return this.f6036b.n(cVar);
    }

    public final String toString() {
        return this.f6035a.toString();
    }
}
