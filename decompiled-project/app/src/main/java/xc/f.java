package xc;

import java.nio.charset.Charset;

/* loaded from: classes2.dex */
public final class f implements Cloneable {

    /* renamed from: a, reason: collision with root package name */
    public m f26335a = m.f26353f;

    /* renamed from: b, reason: collision with root package name */
    public Charset f26336b = vc.b.f25446b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f26337c = true;

    /* renamed from: d, reason: collision with root package name */
    public final int f26338d = 1;

    /* renamed from: e, reason: collision with root package name */
    public final int f26339e = 30;

    /* renamed from: f, reason: collision with root package name */
    public int f26340f = 1;

    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final f clone() {
        try {
            f fVar = (f) super.clone();
            String name = this.f26336b.name();
            fVar.getClass();
            fVar.f26336b = Charset.forName(name);
            fVar.f26335a = m.valueOf(this.f26335a.name());
            return fVar;
        } catch (CloneNotSupportedException e2) {
            throw new RuntimeException(e2);
        }
    }
}
