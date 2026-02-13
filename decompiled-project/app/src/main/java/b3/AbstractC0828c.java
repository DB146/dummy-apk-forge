package b3;

import android.content.ContentValues;
import android.os.Build;

/* renamed from: b3.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0828c {

    /* renamed from: b, reason: collision with root package name */
    public static final String[] f13816b;

    /* renamed from: a, reason: collision with root package name */
    public ContentValues f13817a;

    static {
        String[] strArr = {"_id", "package_name", "title", "episode_title", "season_display_number", "episode_display_number", "short_description", "long_description", "poster_art_uri", "thumbnail_uri", "audio_language", "canonical_genre", "content_rating", "video_width", "video_height", "internal_provider_data", "series_id"};
        String[] strArr2 = {"searchable", "internal_provider_flag1", "internal_provider_flag2", "internal_provider_flag3", "internal_provider_flag4"};
        String[] strArr3 = {"season_title"};
        f13816b = Build.VERSION.SDK_INT >= 26 ? (String[]) AbstractC0829d.a(strArr, strArr2, strArr3, new String[]{"review_rating", "review_rating_style"}) : (String[]) AbstractC0829d.a(strArr, strArr2, strArr3);
    }

    public final long a() {
        Long asLong = this.f13817a.getAsLong("_id");
        if (asLong == null) {
            return -1L;
        }
        return asLong.longValue();
    }

    public final int hashCode() {
        return this.f13817a.hashCode();
    }
}
