RUN /bin/bash -c ". && sdk install java 17.0.8-oracle < /dev/null \
        && sdk flush archives \
        && sdk flush temp"