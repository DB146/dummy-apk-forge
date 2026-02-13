package xc;

/* loaded from: classes2.dex */
public final class h extends p {
    public h(String str, String str2, String str3) {
        super(str);
        vc.i.D(str2);
        vc.i.D(str3);
        b y10 = y();
        y10.i("name", str);
        y10.i("publicId", str2);
        y10.i("systemId", str3);
        if (b0("publicId")) {
            y().i("pubSysKey", "PUBLIC");
        } else if (b0("systemId")) {
            y().i("pubSysKey", "SYSTEM");
        }
    }

    @Override // xc.q
    public final String N() {
        return "#doctype";
    }

    @Override // xc.q
    public final void R(wc.c cVar, f fVar) {
        if (fVar.f26340f != 1 || b0("publicId") || b0("systemId")) {
            cVar.b("<!DOCTYPE");
        } else {
            cVar.b("<!doctype");
        }
        if (b0("name")) {
            cVar.b(" ").b(o("name"));
        }
        if (b0("pubSysKey")) {
            cVar.b(" ").b(o("pubSysKey"));
        }
        if (b0("publicId")) {
            cVar.b(" \"").b(o("publicId")).a('\"');
        }
        if (b0("systemId")) {
            cVar.b(" \"").b(o("systemId")).a('\"');
        }
        cVar.a('>');
    }

    public final boolean b0(String str) {
        return !wc.l.f(o(str));
    }
}
