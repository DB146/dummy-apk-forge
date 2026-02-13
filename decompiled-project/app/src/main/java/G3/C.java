package G3;

import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.dynamite.descriptors.com.google.firebase.auth.ModuleDescriptor;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class C implements t, A3.d {

    /* renamed from: b, reason: collision with root package name */
    public static final C f4285b = new C(0);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4286a;

    public /* synthetic */ C(int i7) {
        this.f4286a = i7;
    }

    public static ByteArrayInputStream a(String str) {
        if (!str.startsWith("data:image")) {
            throw new IllegalArgumentException("Not a valid image data URL.");
        }
        int indexOf = str.indexOf(44);
        if (indexOf == -1) {
            throw new IllegalArgumentException("Missing comma in data URL.");
        }
        if (str.substring(0, indexOf).endsWith(";base64")) {
            return new ByteArrayInputStream(Base64.decode(str.substring(indexOf + 1), 0));
        }
        throw new IllegalArgumentException("Not a base64 image data URL.");
    }

    public Class b() {
        switch (this.f4286a) {
            case 1:
                return ByteBuffer.class;
            case 3:
                return InputStream.class;
            case P1.g.BYTES_FIELD_NUMBER /* 8 */:
                return ParcelFileDescriptor.class;
            default:
                return InputStream.class;
        }
    }

    @Override // A3.d
    public boolean c(Object obj, File file, A3.l lVar) {
        try {
            W3.b.d((ByteBuffer) obj, file);
            return true;
        } catch (IOException e2) {
            if (Log.isLoggable("ByteBufferEncoder", 3)) {
                Log.d("ByteBufferEncoder", "Failed to write data", e2);
            }
            return false;
        }
    }

    @Override // G3.t
    public s m(y yVar) {
        switch (this.f4286a) {
            case 0:
                return D.f4287b;
            case 2:
                return new C0281c(new C(1), 0);
            case 4:
                return new C0281c(new C(3), 0);
            case 6:
                return new D(1);
            case ModuleDescriptor.MODULE_VERSION /* 11 */:
                return new B(yVar.a(Uri.class, AssetFileDescriptor.class), 0);
            case 12:
                return new B(yVar.a(Uri.class, ParcelFileDescriptor.class), 0);
            case 13:
                return new B(yVar.a(Uri.class, InputStream.class), 0);
            default:
                return new G(yVar.a(i.class, InputStream.class));
        }
    }
}
