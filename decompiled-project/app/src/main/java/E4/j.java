package E4;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.view.Surface;
import java.nio.ByteBuffer;
import q4.C1889b;

/* loaded from: classes.dex */
public interface j {
    void C(int i7, int i10, long j, int i11);

    int a(MediaCodec.BufferInfo bufferInfo);

    void d(int i7, boolean z8);

    void flush();

    void h(int i7);

    void i(o5.h hVar, Handler handler);

    MediaFormat p();

    ByteBuffer q(int i7);

    void release();

    void s(Surface surface);

    void t(Bundle bundle);

    ByteBuffer v(int i7);

    void x(int i7, C1889b c1889b, long j);

    void y(int i7, long j);

    int z();
}
