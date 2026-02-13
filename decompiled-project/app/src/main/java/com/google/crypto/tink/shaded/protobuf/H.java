package com.google.crypto.tink.shaded.protobuf;

import java.util.List;

/* loaded from: classes.dex */
public final class H extends I {
    @Override // com.google.crypto.tink.shaded.protobuf.I
    public final void a(Object obj, long j) {
        ((AbstractC1008b) ((InterfaceC1031z) l0.f15799d.i(obj, j))).f15755a = false;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.I
    public final void b(AbstractC1028w abstractC1028w, AbstractC1028w abstractC1028w2, long j) {
        k0 k0Var = l0.f15799d;
        InterfaceC1031z interfaceC1031z = (InterfaceC1031z) k0Var.i(abstractC1028w, j);
        InterfaceC1031z interfaceC1031z2 = (InterfaceC1031z) k0Var.i(abstractC1028w2, j);
        int size = interfaceC1031z.size();
        int size2 = interfaceC1031z2.size();
        if (size > 0 && size2 > 0) {
            if (!((AbstractC1008b) interfaceC1031z).f15755a) {
                interfaceC1031z = interfaceC1031z.j(size2 + size);
            }
            interfaceC1031z.addAll(interfaceC1031z2);
        }
        if (size > 0) {
            interfaceC1031z2 = interfaceC1031z;
        }
        l0.u(abstractC1028w, j, interfaceC1031z2);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.I
    public final List c(Object obj, long j) {
        InterfaceC1031z interfaceC1031z = (InterfaceC1031z) l0.f15799d.i(obj, j);
        if (((AbstractC1008b) interfaceC1031z).f15755a) {
            return interfaceC1031z;
        }
        int size = interfaceC1031z.size();
        InterfaceC1031z j10 = interfaceC1031z.j(size == 0 ? 10 : size * 2);
        l0.u(obj, j, j10);
        return j10;
    }
}
