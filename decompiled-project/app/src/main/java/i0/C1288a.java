package i0;

import a.AbstractC0672a;

/* renamed from: i0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1288a {

    /* renamed from: a, reason: collision with root package name */
    public float f18168a = 0.0f;

    /* renamed from: b, reason: collision with root package name */
    public float f18169b = 0.0f;

    /* renamed from: c, reason: collision with root package name */
    public float f18170c = 0.0f;

    /* renamed from: d, reason: collision with root package name */
    public float f18171d = 0.0f;

    public final void a(float f4, float f10, float f11, float f12) {
        this.f18168a = Math.max(f4, this.f18168a);
        this.f18169b = Math.max(f10, this.f18169b);
        this.f18170c = Math.min(f11, this.f18170c);
        this.f18171d = Math.min(f12, this.f18171d);
    }

    public final boolean b() {
        return (this.f18168a >= this.f18170c) | (this.f18169b >= this.f18171d);
    }

    public final String toString() {
        return "MutableRect(" + AbstractC0672a.v(this.f18168a) + ", " + AbstractC0672a.v(this.f18169b) + ", " + AbstractC0672a.v(this.f18170c) + ", " + AbstractC0672a.v(this.f18171d) + ')';
    }
}
