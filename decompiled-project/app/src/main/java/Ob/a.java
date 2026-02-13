package Ob;

import java.io.ByteArrayOutputStream;
import kotlin.jvm.internal.l;

/* loaded from: classes2.dex */
public final class a extends ByteArrayOutputStream {
    public final byte[] l() {
        byte[] buf = ((ByteArrayOutputStream) this).buf;
        l.d(buf, "buf");
        return buf;
    }
}
