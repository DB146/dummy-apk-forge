package Bc;

import javax.xml.stream.events.Attribute;

/* loaded from: classes2.dex */
public final class w extends f {

    /* renamed from: a, reason: collision with root package name */
    public final Attribute f2324a;

    public w(Attribute attribute) {
        this.f2324a = attribute;
    }

    @Override // Bc.f
    public final String a() {
        return this.f2324a.getName().getLocalPart();
    }

    @Override // Bc.f
    public final String b() {
        return this.f2324a.getName().getPrefix();
    }

    @Override // Bc.f
    public final String c() {
        return this.f2324a.getName().getNamespaceURI();
    }

    @Override // Bc.f
    public final Object d() {
        return this.f2324a;
    }

    @Override // Bc.f
    public final String e() {
        return this.f2324a.getValue();
    }

    @Override // Bc.f
    public final boolean f() {
        return false;
    }
}
