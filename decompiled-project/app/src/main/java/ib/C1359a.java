package ib;

import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.Serializable;
import vc.i;

/* renamed from: ib.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1359a extends i {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f18488f;
    public final Object g;

    public /* synthetic */ C1359a(Object obj, int i7) {
        this.f18488f = i7;
        this.g = obj;
    }

    @Override // vc.i
    public final i e(Serializable serializable) {
        switch (this.f18488f) {
            case 0:
                ((PrintStream) this.g).print(serializable);
                return this;
            default:
                ((PrintWriter) this.g).print(serializable);
                return this;
        }
    }
}
