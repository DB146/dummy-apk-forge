package v6;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextPaint;

/* loaded from: classes.dex */
public final class c extends Y6.b {
    public final /* synthetic */ Context k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ TextPaint f25082l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Y6.b f25083m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ d f25084n;

    public c(d dVar, Context context, TextPaint textPaint, Y6.b bVar) {
        this.f25084n = dVar;
        this.k = context;
        this.f25082l = textPaint;
        this.f25083m = bVar;
    }

    @Override // Y6.b
    public final void t(int i7) {
        this.f25083m.t(i7);
    }

    @Override // Y6.b
    public final void u(Typeface typeface, boolean z8) {
        this.f25084n.g(this.k, this.f25082l, typeface);
        this.f25083m.u(typeface, z8);
    }
}
