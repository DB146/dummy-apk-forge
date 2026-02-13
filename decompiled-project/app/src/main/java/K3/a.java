package K3;

import android.os.ParcelFileDescriptor;
import com.bumptech.glide.load.data.f;
import com.bumptech.glide.load.data.g;
import com.bumptech.glide.load.data.h;
import g3.C1191j;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class a implements f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6112a;

    public /* synthetic */ a(int i7) {
        this.f6112a = i7;
    }

    @Override // com.bumptech.glide.load.data.f
    public final g a(Object obj) {
        switch (this.f6112a) {
            case 0:
                return new C1191j((ByteBuffer) obj, 21);
            case 1:
                return new h(obj);
            default:
                return new h((ParcelFileDescriptor) obj);
        }
    }

    @Override // com.bumptech.glide.load.data.f
    public final Class b() {
        switch (this.f6112a) {
            case 0:
                return ByteBuffer.class;
            case 1:
                throw new UnsupportedOperationException("Not implemented");
            default:
                return ParcelFileDescriptor.class;
        }
    }
}
