package okhttp3;

import java.io.FileDescriptor;
import java.io.FileInputStream;
import rc.C1960d;
import rc.InterfaceC1965i;
import tc.b;

/* loaded from: classes2.dex */
public final class RequestBody$Companion$toRequestBody$2 extends RequestBody {
    @Override // okhttp3.RequestBody
    public final MediaType b() {
        return null;
    }

    @Override // okhttp3.RequestBody
    public final void d(InterfaceC1965i interfaceC1965i) {
        FileInputStream fileInputStream = new FileInputStream((FileDescriptor) null);
        try {
            interfaceC1965i.c().k0(new C1960d(1, fileInputStream, new Object()));
            b.o(fileInputStream, null);
        } finally {
        }
    }
}
