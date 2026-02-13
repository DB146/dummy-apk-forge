package B3;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.provider.MediaStore;

/* loaded from: classes.dex */
public final class a implements c {

    /* renamed from: c, reason: collision with root package name */
    public static final String[] f2033c = {"_data"};

    /* renamed from: d, reason: collision with root package name */
    public static final String[] f2034d = {"_data"};

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2035a;

    /* renamed from: b, reason: collision with root package name */
    public final ContentResolver f2036b;

    public /* synthetic */ a(ContentResolver contentResolver, int i7) {
        this.f2035a = i7;
        this.f2036b = contentResolver;
    }

    @Override // B3.c
    public final Cursor a(Uri uri) {
        switch (this.f2035a) {
            case 0:
                String lastPathSegment = uri.getLastPathSegment();
                return this.f2036b.query(MediaStore.Images.Thumbnails.EXTERNAL_CONTENT_URI, f2033c, "kind = 1 AND image_id = ?", new String[]{lastPathSegment}, null);
            default:
                String lastPathSegment2 = uri.getLastPathSegment();
                return this.f2036b.query(MediaStore.Video.Thumbnails.EXTERNAL_CONTENT_URI, f2034d, "kind = 1 AND video_id = ?", new String[]{lastPathSegment2}, null);
        }
    }
}
