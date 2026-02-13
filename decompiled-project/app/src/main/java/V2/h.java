package V2;

import A9.N2;
import Db.o;
import Db.p;
import android.content.Context;
import kotlin.jvm.internal.l;

/* loaded from: classes.dex */
public final class h implements U2.d {

    /* renamed from: a, reason: collision with root package name */
    public final Context f10018a;

    /* renamed from: b, reason: collision with root package name */
    public final String f10019b;

    /* renamed from: c, reason: collision with root package name */
    public final A4.c f10020c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f10021d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f10022e;

    /* renamed from: f, reason: collision with root package name */
    public final o f10023f;

    /* renamed from: u, reason: collision with root package name */
    public boolean f10024u;

    public h(Context context, String str, A4.c callback, boolean z8, boolean z10) {
        l.e(context, "context");
        l.e(callback, "callback");
        this.f10018a = context;
        this.f10019b = str;
        this.f10020c = callback;
        this.f10021d = z8;
        this.f10022e = z10;
        this.f10023f = android.support.v4.media.session.b.z(new N2(this, 18));
    }

    @Override // U2.d
    public final U2.a N() {
        return ((g) this.f10023f.getValue()).l(true);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f10023f.f3362b != p.f3364a) {
            ((g) this.f10023f.getValue()).close();
        }
    }

    @Override // U2.d
    public final String getDatabaseName() {
        return this.f10019b;
    }

    @Override // U2.d
    public final void setWriteAheadLoggingEnabled(boolean z8) {
        if (this.f10023f.f3362b != p.f3364a) {
            ((g) this.f10023f.getValue()).setWriteAheadLoggingEnabled(z8);
        }
        this.f10024u = z8;
    }
}
