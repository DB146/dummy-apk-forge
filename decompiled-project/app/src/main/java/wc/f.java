package wc;

import java.io.Reader;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CoderResult;
import java.nio.charset.CodingErrorAction;

/* loaded from: classes2.dex */
public final class f extends Reader {

    /* renamed from: a, reason: collision with root package name */
    public final a f25882a;

    /* renamed from: b, reason: collision with root package name */
    public final CharsetDecoder f25883b;

    /* renamed from: c, reason: collision with root package name */
    public ByteBuffer f25884c;

    public f(a aVar, Charset charset) {
        this.f25882a = aVar;
        CharsetDecoder newDecoder = charset.newDecoder();
        CodingErrorAction codingErrorAction = CodingErrorAction.REPLACE;
        this.f25883b = newDecoder.onMalformedInput(codingErrorAction).onUnmappableCharacter(codingErrorAction);
        ByteBuffer wrap = ByteBuffer.wrap((byte[]) e.f25876f.d());
        this.f25884c = wrap;
        wrap.flip();
    }

    @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        ByteBuffer byteBuffer = this.f25884c;
        if (byteBuffer == null) {
            return;
        }
        e.f25876f.o(byteBuffer.array());
        this.f25884c = null;
        this.f25882a.close();
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x0095, code lost:
    
        throw new java.io.IOException("Underlying input stream returned zero bytes");
     */
    @Override // java.io.Reader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int read(char[] cArr, int i7, int i10) {
        CharsetDecoder charsetDecoder;
        vc.i.D(this.f25884c);
        CharBuffer wrap = CharBuffer.wrap(cArr, i7, i10);
        if (wrap.position() != 0) {
            wrap = wrap.slice();
        }
        boolean z8 = false;
        while (true) {
            ByteBuffer byteBuffer = this.f25884c;
            charsetDecoder = this.f25883b;
            CoderResult decode = charsetDecoder.decode(byteBuffer, wrap, z8);
            if (decode.isUnderflow()) {
                if (z8 || !wrap.hasRemaining()) {
                    break;
                }
                int position = wrap.position();
                a aVar = this.f25882a;
                if (position > 0 && aVar.available() <= 0) {
                    break;
                }
                this.f25884c.compact();
                try {
                    int position2 = this.f25884c.position();
                    int read = aVar.read(this.f25884c.array(), this.f25884c.arrayOffset() + position2, this.f25884c.limit() - position2);
                    if (read >= 0) {
                        if (read == 0) {
                            break;
                        }
                        this.f25884c.position(position2 + read);
                        this.f25884c.flip();
                        read = this.f25884c.remaining();
                    }
                    if (read < 0) {
                        if (wrap.position() == 0 && !this.f25884c.hasRemaining()) {
                            z8 = true;
                            break;
                        }
                        z8 = true;
                    } else {
                        continue;
                    }
                } finally {
                    this.f25884c.flip();
                }
            } else {
                if (decode.isOverflow()) {
                    break;
                }
                decode.throwException();
            }
        }
        if (z8) {
            charsetDecoder.reset();
        }
        if (wrap.position() == 0) {
            return -1;
        }
        return wrap.position();
    }
}
