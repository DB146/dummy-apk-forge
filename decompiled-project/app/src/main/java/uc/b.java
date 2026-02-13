package uc;

import java.io.IOException;

/* loaded from: classes2.dex */
public final class b extends IOException {

    /* renamed from: a, reason: collision with root package name */
    public final String f24919a;

    /* renamed from: b, reason: collision with root package name */
    public final String f24920b;

    public b(String str, String str2) {
        super("Unhandled content type. Must be text/*, */xml, or */*+xml");
        this.f24919a = str;
        this.f24920b = str2;
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return super.toString() + ". Mimetype=" + this.f24919a + ", URL=" + this.f24920b;
    }
}
