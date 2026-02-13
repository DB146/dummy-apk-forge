package m5;

import java.io.IOException;

/* renamed from: m5.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1617n extends IOException {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f20620b = 0;

    /* renamed from: a, reason: collision with root package name */
    public final int f20621a;

    public C1617n(int i7) {
        this.f20621a = i7;
    }

    public C1617n(int i7, Exception exc) {
        super(exc);
        this.f20621a = i7;
    }

    public C1617n(String str, int i7) {
        super(str);
        this.f20621a = i7;
    }

    public C1617n(String str, Exception exc, int i7) {
        super(str, exc);
        this.f20621a = i7;
    }
}
