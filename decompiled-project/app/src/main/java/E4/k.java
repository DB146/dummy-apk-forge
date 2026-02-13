package E4;

import android.media.MediaCodec;
import n5.D;

/* loaded from: classes.dex */
public class k extends q4.e {

    /* renamed from: a, reason: collision with root package name */
    public final String f3580a;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public k(IllegalStateException illegalStateException, m mVar) {
        super(r0.toString(), illegalStateException);
        StringBuilder sb2 = new StringBuilder("Decoder failed: ");
        String str = null;
        sb2.append(mVar == null ? null : mVar.f3581a);
        if (D.f21141a >= 21 && (illegalStateException instanceof MediaCodec.CodecException)) {
            str = ((MediaCodec.CodecException) illegalStateException).getDiagnosticInfo();
        }
        this.f3580a = str;
    }
}
