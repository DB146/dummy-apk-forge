package r5;

/* renamed from: r5.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1942a {

    /* renamed from: a, reason: collision with root package name */
    public final String f23785a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f23786b;

    public C1942a(String str, boolean z8) {
        this.f23785a = str;
        this.f23786b = z8;
    }

    public final String toString() {
        String str = this.f23785a;
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 7);
        sb2.append("{");
        sb2.append(str);
        sb2.append("}");
        sb2.append(this.f23786b);
        return sb2.toString();
    }
}
