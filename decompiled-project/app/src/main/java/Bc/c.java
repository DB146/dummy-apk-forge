package Bc;

import org.w3c.dom.Node;

/* loaded from: classes2.dex */
public final class c extends f {

    /* renamed from: a, reason: collision with root package name */
    public final Node f2305a;

    public c(Node node) {
        this.f2305a = node;
    }

    @Override // Bc.f
    public final String a() {
        return this.f2305a.getLocalName();
    }

    @Override // Bc.f
    public final String b() {
        return this.f2305a.getPrefix();
    }

    @Override // Bc.f
    public final String c() {
        return this.f2305a.getNamespaceURI();
    }

    @Override // Bc.f
    public final Object d() {
        return this.f2305a;
    }

    @Override // Bc.f
    public final String e() {
        return this.f2305a.getNodeValue();
    }

    @Override // Bc.f
    public final boolean f() {
        Node node = this.f2305a;
        String prefix = node.getPrefix();
        return prefix != null ? prefix.startsWith("xml") : node.getLocalName().startsWith("xml");
    }
}
