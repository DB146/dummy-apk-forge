package G3;

import android.content.res.Resources;
import java.io.IOException;

/* renamed from: G3.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0284f implements com.bumptech.glide.load.data.e {

    /* renamed from: a, reason: collision with root package name */
    public final Resources.Theme f4302a;

    /* renamed from: b, reason: collision with root package name */
    public final Resources f4303b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f4304c;

    /* renamed from: d, reason: collision with root package name */
    public final int f4305d;

    /* renamed from: e, reason: collision with root package name */
    public Object f4306e;

    public C0284f(Resources.Theme theme, Resources resources, InterfaceC0285g interfaceC0285g, int i7) {
        this.f4302a = theme;
        this.f4303b = resources;
        this.f4304c = interfaceC0285g;
        this.f4305d = i7;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [G3.g, java.lang.Object] */
    @Override // com.bumptech.glide.load.data.e
    public final void a() {
        Object obj = this.f4306e;
        if (obj != null) {
            try {
                this.f4304c.d(obj);
            } catch (IOException unused) {
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [G3.g, java.lang.Object] */
    @Override // com.bumptech.glide.load.data.e
    public final Class b() {
        return this.f4304c.b();
    }

    @Override // com.bumptech.glide.load.data.e
    public final void cancel() {
    }

    @Override // com.bumptech.glide.load.data.e
    public final A3.a d() {
        return A3.a.f342a;
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [G3.g, java.lang.Object] */
    @Override // com.bumptech.glide.load.data.e
    public final void f(com.bumptech.glide.g gVar, com.bumptech.glide.load.data.d dVar) {
        try {
            Object c10 = this.f4304c.c(this.f4305d, this.f4302a, this.f4303b);
            this.f4306e = c10;
            dVar.e(c10);
        } catch (Resources.NotFoundException e2) {
            dVar.c(e2);
        }
    }
}
