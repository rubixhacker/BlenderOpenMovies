package com.hackedcube;

import java.util.ArrayList;
import java.util.List;

public final class MovieList {
    public static final String MOVIE_CATEGORY[] = {
            "Movies",
            "Gallary",
    };

    public static List<Movie> list;

    public static List<Movie> setupMovies() {
        list = new ArrayList<Movie>();
        String title[] = {
                "Elephants Dream",
                "Big Buck Bunny",
                "Sintel",
                "Tears of Steel"
        };

        String descriptions[] = {
                "Project Orange was the Blender Foundation’s first open movie. The movie started production in September 2005 and was premiered at the end of March 2006. The ambitions and targets for Orange were set very high; the character animation system had to be fully recoded, the rendering system needed a lot of upgrades, and most of all: a node-based compositor was required.\n" +
                        "\n" +
                        "Elephants Dream was co-produced with the Netherlands Media Art Institute, who challenged the team to explore an abstract concept and storyline. This 10 minute short shows two people who explore a strange mechanical world, with each an entire own perception on what’s actually there. The emotional ending shows once more the violent impact of mixing reality and fantasy.",
                "Project Peach was the Blender Foundation’s second open movie. The movie started production in October 2007 and premiered April 2008. The targets this time were to create good hair/fur editing and rendering, more advanced support for cartoon characters, and improve performance with complex outdoors environments with grass, trees and leaves.\n" +
                        "\n" +
                        "Big Buck Bunny was the first project created in the Blender Institute‘s studio in Amsterdam.  A giant, gentle rabbit finds his happy morning walk being disturbed by rodents who kill his two favorite butterflies. In rage, he sets up a masterful plan to avenge the deaths of the butterflies.",
                "Project Durian was the Blender Institute’s third movie. The movie started production in September 2009 and was premiered at the Netherlands Film Festival at the end of September 2010. With a much larger team and bigger budget, the targets were very ambitious, resulting in a 15 minute short film that has found much acclaim on the web; story telling and editing were top priorities for the team.\n" +
                        "\n" +
                        "Development targets mainly focused on getting the Blender 2.5x series more stable and usable, improving the sculpting tools, efficient detail rendering and global illumination.",
                "Project Mango was the Blender Foundation’s fourth movie. Production took place from March 2012 to October 2012 in the Blender Institute’s studio in Amsterdam. The targets were VFX compositing (green screens) and realistic renders with Cycles.\n" +
                        "\n" +
                        "Seattle-based director Ian Hubert was invited to work in Amsterdam with an artist/developer crew on a sci-fi short film set in Amsterdam. Thanks to crowdfunding and support from the Netherlands Film Fund, a week of filming with a professional camera/light/sound crew was possible. The original footage was shot in a well-equipped green screen studio and on location in Amsterdam.\n" +
                        "\n" +
                        "The Blender Institute team then worked four months on realizing the VFX for the film. Improvements were made to Blender’s motion tracker, camera solver, masking, Cycles, and color grading.\n" +
                        "\n" +
                        "Additional funding by cinegrid.nl made it possible to re-render and deliver the whole film in 4k resolution. This version was released in April 2013."
        };

        String videoUrl[] = {
                "https://archive.org/download/ElephantsDream/ed_hd.mp4",
                "https://archive.org/download/BigBuckBunny_328/BigBuckBunny_512kb.mp4",
                "https://archive.org/download/Sintel/sintel-2048-surround_512kb.mp4",
                "https://archive.org/download/Tears-of-Steel/tears_of_steel_1080p.mp4"
        };
        String bgImageUrl[] = {
                "https://orange.blender.org/wp-content/themes/orange/images/media/gallery/s2_bridge.jpg",
                "https://peach.blender.org/wp-content/uploads/bunny-bow.png",
                "https://durian.blender.org/wp-content/uploads/2010/06/08.2l_comp_000465.jpg",
                "https://mango.blender.org/wp-content/gallery/4k-renders/10_thom_robot.jpg"
        };
        String cardImageUrl[] = {
                "https://orange.blender.org/wp-content/themes/orange/images/media/gallery/s1_proog.jpg",
                "https://peach.blender.org/wp-content/uploads/evil-frank.png",
                "https://durian.blender.org/wp-content/uploads/2010/06/03.1b_comp_000120.jpg",
                "https://mango.blender.org/wp-content/gallery/4k-renders/01_thom_celia_bridge.jpg"
        };

        list.add(buildMovieInfo("category", title[0],
                descriptions[0], "Blender Open Movie Foundation", videoUrl[0], cardImageUrl[0], bgImageUrl[0]));
        list.add(buildMovieInfo("category", title[1],
                descriptions[1], "Blender Open Movie Foundation", videoUrl[1], cardImageUrl[1], bgImageUrl[1]));
        list.add(buildMovieInfo("category", title[2],
                descriptions[2], "Blender Open Movie Foundation", videoUrl[2], cardImageUrl[2], bgImageUrl[2]));
        list.add(buildMovieInfo("category", title[3],
                descriptions[3], "Blender Open Movie Foundation", videoUrl[3], cardImageUrl[3], bgImageUrl[3]));

        return list;
    }

    private static Movie buildMovieInfo(String category, String title,
                                        String description, String studio, String videoUrl, String cardImageUrl,
                                        String bgImageUrl) {
        Movie movie = new Movie();
        movie.setId(Movie.getCount());
        Movie.incCount();
        movie.setTitle(title);
        movie.setDescription(description);
        movie.setStudio(studio);
        movie.setCategory(category);
        movie.setCardImageUrl(cardImageUrl);
        movie.setBackgroundImageUrl(bgImageUrl);
        movie.setVideoUrl(videoUrl);
        return movie;
    }
}
