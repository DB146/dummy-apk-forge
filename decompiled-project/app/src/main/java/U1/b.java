package U1;

import android.util.Log;
import java.io.ByteArrayInputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteOrder;

/* loaded from: classes.dex */
public class b extends InputStream implements DataInput {

    /* renamed from: e, reason: collision with root package name */
    public static final ByteOrder f9452e = ByteOrder.LITTLE_ENDIAN;

    /* renamed from: f, reason: collision with root package name */
    public static final ByteOrder f9453f = ByteOrder.BIG_ENDIAN;

    /* renamed from: a, reason: collision with root package name */
    public final DataInputStream f9454a;

    /* renamed from: b, reason: collision with root package name */
    public ByteOrder f9455b;

    /* renamed from: c, reason: collision with root package name */
    public int f9456c;

    /* renamed from: d, reason: collision with root package name */
    public byte[] f9457d;

    public b(InputStream inputStream) {
        this(inputStream, ByteOrder.BIG_ENDIAN);
    }

    public b(InputStream inputStream, ByteOrder byteOrder) {
        this.f9455b = ByteOrder.BIG_ENDIAN;
        DataInputStream dataInputStream = new DataInputStream(inputStream);
        this.f9454a = dataInputStream;
        dataInputStream.mark(0);
        this.f9456c = 0;
        this.f9455b = byteOrder;
    }

    public b(byte[] bArr) {
        this(new ByteArrayInputStream(bArr), ByteOrder.BIG_ENDIAN);
    }

    @Override // java.io.InputStream
    public final int available() {
        return this.f9454a.available();
    }

    public final void l(int i7) {
        int i10 = 0;
        while (i10 < i7) {
            DataInputStream dataInputStream = this.f9454a;
            int i11 = i7 - i10;
            int skip = (int) dataInputStream.skip(i11);
            if (skip <= 0) {
                if (this.f9457d == null) {
                    this.f9457d = new byte[8192];
                }
                skip = dataInputStream.read(this.f9457d, 0, Math.min(8192, i11));
                if (skip == -1) {
                    throw new EOFException(A3.c.f(i7, "Reached EOF while skipping ", " bytes."));
                }
            }
            i10 += skip;
        }
        this.f9456c += i10;
    }

    @Override // java.io.InputStream
    public final void mark(int i7) {
        throw new UnsupportedOperationException("Mark is currently unsupported");
    }

    @Override // java.io.InputStream
    public final int read() {
        this.f9456c++;
        return this.f9454a.read();
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i7, int i10) {
        int read = this.f9454a.read(bArr, i7, i10);
        this.f9456c += read;
        return read;
    }

    @Override // java.io.DataInput
    public final boolean readBoolean() {
        this.f9456c++;
        return this.f9454a.readBoolean();
    }

    @Override // java.io.DataInput
    public final byte readByte() {
        this.f9456c++;
        int read = this.f9454a.read();
        if (read >= 0) {
            return (byte) read;
        }
        throw new EOFException();
    }

    @Override // java.io.DataInput
    public final char readChar() {
        this.f9456c += 2;
        return this.f9454a.readChar();
    }

    @Override // java.io.DataInput
    public final double readDouble() {
        return Double.longBitsToDouble(readLong());
    }

    @Override // java.io.DataInput
    public final float readFloat() {
        return Float.intBitsToFloat(readInt());
    }

    @Override // java.io.DataInput
    public final void readFully(byte[] bArr) {
        this.f9456c += bArr.length;
        this.f9454a.readFully(bArr);
    }

    @Override // java.io.DataInput
    public final void readFully(byte[] bArr, int i7, int i10) {
        this.f9456c += i10;
        this.f9454a.readFully(bArr, i7, i10);
    }

    @Override // java.io.DataInput
    public final int readInt() {
        this.f9456c += 4;
        DataInputStream dataInputStream = this.f9454a;
        int read = dataInputStream.read();
        int read2 = dataInputStream.read();
        int read3 = dataInputStream.read();
        int read4 = dataInputStream.read();
        if ((read | read2 | read3 | read4) < 0) {
            throw new EOFException();
        }
        ByteOrder byteOrder = this.f9455b;
        if (byteOrder == f9452e) {
            return (read4 << 24) + (read3 << 16) + (read2 << 8) + read;
        }
        if (byteOrder == f9453f) {
            return (read << 24) + (read2 << 16) + (read3 << 8) + read4;
        }
        throw new IOException("Invalid byte order: " + this.f9455b);
    }

    @Override // java.io.DataInput
    public final String readLine() {
        Log.d("ExifInterface", "Currently unsupported");
        return null;
    }

    @Override // java.io.DataInput
    public final long readLong() {
        this.f9456c += 8;
        DataInputStream dataInputStream = this.f9454a;
        int read = dataInputStream.read();
        int read2 = dataInputStream.read();
        int read3 = dataInputStream.read();
        int read4 = dataInputStream.read();
        int read5 = dataInputStream.read();
        int read6 = dataInputStream.read();
        int read7 = dataInputStream.read();
        int read8 = dataInputStream.read();
        if ((read | read2 | read3 | read4 | read5 | read6 | read7 | read8) < 0) {
            throw new EOFException();
        }
        ByteOrder byteOrder = this.f9455b;
        if (byteOrder == f9452e) {
            return (read8 << 56) + (read7 << 48) + (read6 << 40) + (read5 << 32) + (read4 << 24) + (read3 << 16) + (read2 << 8) + read;
        }
        if (byteOrder == f9453f) {
            return (read << 56) + (read2 << 48) + (read3 << 40) + (read4 << 32) + (read5 << 24) + (read6 << 16) + (read7 << 8) + read8;
        }
        throw new IOException("Invalid byte order: " + this.f9455b);
    }

    @Override // java.io.DataInput
    public final short readShort() {
        this.f9456c += 2;
        DataInputStream dataInputStream = this.f9454a;
        int read = dataInputStream.read();
        int read2 = dataInputStream.read();
        if ((read | read2) < 0) {
            throw new EOFException();
        }
        ByteOrder byteOrder = this.f9455b;
        if (byteOrder == f9452e) {
            return (short) ((read2 << 8) + read);
        }
        if (byteOrder == f9453f) {
            return (short) ((read << 8) + read2);
        }
        throw new IOException("Invalid byte order: " + this.f9455b);
    }

    @Override // java.io.DataInput
    public final String readUTF() {
        this.f9456c += 2;
        return this.f9454a.readUTF();
    }

    @Override // java.io.DataInput
    public final int readUnsignedByte() {
        this.f9456c++;
        return this.f9454a.readUnsignedByte();
    }

    @Override // java.io.DataInput
    public final int readUnsignedShort() {
        this.f9456c += 2;
        DataInputStream dataInputStream = this.f9454a;
        int read = dataInputStream.read();
        int read2 = dataInputStream.read();
        if ((read | read2) < 0) {
            throw new EOFException();
        }
        ByteOrder byteOrder = this.f9455b;
        if (byteOrder == f9452e) {
            return (read2 << 8) + read;
        }
        if (byteOrder == f9453f) {
            return (read << 8) + read2;
        }
        throw new IOException("Invalid byte order: " + this.f9455b);
    }

    @Override // java.io.InputStream
    public final void reset() {
        throw new UnsupportedOperationException("Reset is currently unsupported");
    }

    @Override // java.io.DataInput
    public final int skipBytes(int i7) {
        throw new UnsupportedOperationException("skipBytes is currently unsupported");
    }
}
