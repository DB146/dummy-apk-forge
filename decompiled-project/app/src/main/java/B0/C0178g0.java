package B0;

import android.os.Looper;
import android.view.Choreographer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CodingErrorAction;
import java.security.SecureRandom;
import java.util.Random;

/* renamed from: B0.g0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0178g0 extends ThreadLocal {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1907a;

    public /* synthetic */ C0178g0(int i7) {
        this.f1907a = i7;
    }

    @Override // java.lang.ThreadLocal
    public final Object initialValue() {
        switch (this.f1907a) {
            case 0:
                Choreographer choreographer = Choreographer.getInstance();
                Looper myLooper = Looper.myLooper();
                if (myLooper == null) {
                    throw new IllegalStateException("no Looper on this thread");
                }
                C0182i0 c0182i0 = new C0182i0(choreographer, com.bumptech.glide.d.f(myLooper));
                return E6.b.w(c0182i0, c0182i0.f1920z);
            case 1:
                return 0L;
            case 2:
                CharsetDecoder newDecoder = Charset.forName("UTF8").newDecoder();
                CodingErrorAction codingErrorAction = CodingErrorAction.REPORT;
                newDecoder.onMalformedInput(codingErrorAction);
                newDecoder.onUnmappableCharacter(codingErrorAction);
                return newDecoder;
            case 3:
                CharsetEncoder newEncoder = Charset.forName("UTF8").newEncoder();
                CodingErrorAction codingErrorAction2 = CodingErrorAction.REPORT;
                newEncoder.onMalformedInput(codingErrorAction2);
                newEncoder.onUnmappableCharacter(codingErrorAction2);
                return newEncoder;
            case 4:
                return new Random();
            case 5:
                SecureRandom secureRandom = new SecureRandom();
                secureRandom.nextLong();
                return secureRandom;
            default:
                return Boolean.FALSE;
        }
    }
}
